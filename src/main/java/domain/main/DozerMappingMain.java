package domain.main;

import com.rackspace.customer.Address;
import com.rackspace.customer.Contact;
import domain.builders.LambdaAddressBuilder;
import domain.builders.LambdaPersonBuilder;
import domain.entity.AddressEntity;
import domain.entity.PersonEntity;
import org.dozer.DozerBeanMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

public class DozerMappingMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");

        DozerBeanMapper beanMapper = applicationContext.getBean(DozerBeanMapper.class);
        AddressEntity addressEntity = LambdaAddressBuilder.build(
                address -> address.setCity("Austin"),
                address -> address.setState("TX"),
                address -> address.setCountry("US"),
                address -> address.setPrimary(true),
                address -> address.setStreet("8038 Exchange Dr, Apt 835")
        );

        AddressEntity addressEntity1 = LambdaAddressBuilder.build(
                address -> address.setCity("Austin"),
                address -> address.setState("TX"),
                address -> address.setCountry("US"),
                address -> address.setPrimary(false),
                address -> address.setStreet("8038 Exchange Dr, Apt 412")
        );

        Set<AddressEntity> addresses = new HashSet<>();
        addresses.add(addressEntity);
        addresses.add(addressEntity1);

        PersonEntity personEntity = LambdaPersonBuilder.build(
                person -> person.setFirstName("Srikanth"),
                person -> person.setLastName("Kambhampati"),
                person -> person.setTitle("Mr"),
                person -> person.setUserId("srik4897"),
                person -> person.setComment("test comment"),
                person -> person.setPersonNumber(999000222),
                person -> person.setLegacyNumber("A9087645"),
                person -> person.setAddresses(addresses)
        );

        Contact contact = beanMapper.map(personEntity, Contact.class);

        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getTitle());
        System.out.println(contact.getUsername());
        System.out.println(contact.getContactNumber());
        System.out.println(contact.getLegacyNumber());

        for(Address address : contact.getAddresses().getAddress()) {
            System.out.println(address.getCity());
            System.out.println(address.getCountry());
            System.out.println(address.getState());
            System.out.println(address.getStreet());
            System.out.println(address.isPrimary());
        }
    }
}
