package java8.streams;

import java.util.Arrays;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        String str = "The first second was right but the second second was tough.";
        String [] words = str.split(" ");
        Arrays.stream(words).filter(word -> !word.equals(" ")).distinct().forEach(n -> System.out.print(n + " "));
    }
}
