package Optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        // Creating an Optional object with a non-null value
        Optional<String> optionalWithValue = Optional.of("Hello, World!");

        // Creating an Optional object that may or may not contain a value
        Optional<String> optionalWithNull = Optional.ofNullable(null);

        // Creating an empty Optional object
        Optional<String> emptyOptional = Optional.empty();

        // Checking if a value is present
        if (optionalWithValue.isPresent()) {
            System.out.println("Value is present: " + optionalWithValue.get());
        } else {
            System.out.println("Value is not present");
        }

        // Using ifPresent() to execute a lambda expression if a value is present
        optionalWithValue.ifPresent(value -> System.out.println("Using ifPresent: " + value));

        // Providing a default value using orElse()
        String value1 = optionalWithNull.orElse("Default Value");
        System.out.println("Value with orElse: " + value1);

        // Providing a default value using orElseGet()
        String value2 = optionalWithNull.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Value with orElseGet: " + value2);

        // Throwing an exception if the value is not present using orElseThrow()
        try {
            String value3 = optionalWithNull.orElseThrow(() -> new IllegalArgumentException("Value not present"));
            System.out.println("Value with orElseThrow: " + value3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Transforming the value using map()
        Optional<Integer> lengthOptional = optionalWithValue.map(String::length);
        lengthOptional.ifPresent(length -> System.out.println("Length of the string: " + length));
    }
}
