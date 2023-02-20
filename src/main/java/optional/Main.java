package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> hello = Optional.of("hello");

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        String world = hello.orElse("world");

        System.out.println(world);

        String orElse  = hello.map(String::toUpperCase).orElse("world");

    }
}
