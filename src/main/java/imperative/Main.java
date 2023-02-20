package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("aaa", MAIL),
                new Person("bbb", FEMAIL),
                new Person("ccc", MAIL),
                new Person("ddd", FEMAIL),
                new Person("eee", MAIL)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMAIL.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // Declarative approach
        people.stream()
                .filter(person -> FEMAIL.equals(person.gender))
                .collect(Collectors.toList());

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        enum Gender {
            MAIL, FEMAIL
        }
    }

}
