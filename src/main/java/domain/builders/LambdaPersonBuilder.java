package domain.builders;

import domain.entity.PersonEntity;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaPersonBuilder {
    @FunctionalInterface
    public interface PersonEntitySetter extends Consumer<PersonEntity> {}

    public static PersonEntity build(PersonEntitySetter... personSetters) {
        final PersonEntity person = new PersonEntity();

        Stream.of(personSetters).forEach(
                s -> s.accept(person)
        );

        return person;
    }
}
