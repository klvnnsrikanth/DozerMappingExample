package domain.converter;

import com.rackspace.customer.Address;
import com.rackspace.customer.Contact;
import domain.entity.AddressEntity;
import domain.entity.PersonEntity;
import org.dozer.CustomConverter;

import java.text.DecimalFormat;

public class PersonNumberAdapter implements CustomConverter {
    private static final String PERSON_NUMBER_PREFIX = "RPN";
    private static final int MIN_INTEGER_DIGITS = 9;
    private static final int GROUP_SIZE = 3;
    private static final String PERSON_NUMBER_REGEX = PERSON_NUMBER_PREFIX + "-[0-9]{3}-[0-9]{3}-[0-9]{3}";

    private static final DecimalFormat FORMAT = new DecimalFormat();

    static {
        FORMAT.setMinimumIntegerDigits(MIN_INTEGER_DIGITS);
        FORMAT.setGroupingSize(GROUP_SIZE);
        FORMAT.setPositivePrefix(PERSON_NUMBER_PREFIX + "-");
    }

    public static Integer verifyAndParse(String number){
        if(number == null) return null;

        if(verifyRegexMatch(number)) {
            return parse(number);
        }

        return Integer.parseInt(number);
    }

    public static Integer parse(String number) {
        return Integer.parseInt(number.replaceAll("[^0-9]", ""));
    }

    private static boolean verifyRegexMatch(final String number) {
        return number.matches(PERSON_NUMBER_REGEX);
    }

    public static String format(Integer number) {
        return number == null ? null : FORMAT.format(number).replace(',', '-');
    }


    @Override
    public Object convert(Object o, Object o2, Class<?> aClass, Class<?> bClass) {

        if(aClass.equals(String.class) && bClass.equals(Integer.class)) {
            o = format(Integer.parseInt(o2.toString()));
            return o;
        }
        return null;
    }
}
