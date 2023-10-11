package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocados");

        // Create a stream from the list using stream()
        Stream<String> fruitStream = fruits.stream();

        // Perform operations on the stream
        fruitStream
                .filter(fruit -> fruit.startsWith("A") && fruit.endsWith("s"))
                .forEach(System.out::println);
    }
}
