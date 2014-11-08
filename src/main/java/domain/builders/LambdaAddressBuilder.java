package domain.builders;

import domain.entity.AddressEntity;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaAddressBuilder {
    @FunctionalInterface
    public interface AddressEntitySetter extends Consumer<AddressEntity> {}

    public static AddressEntity build(AddressEntitySetter... personSetters) {
        final AddressEntity person = new AddressEntity();

        Stream.of(personSetters).forEach(
                s -> s.accept(person)
        );

        return person;
    }
}
