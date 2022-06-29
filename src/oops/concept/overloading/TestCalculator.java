package oops.concept.overloading;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5,5));
        System.out.println(calculator.sum(5,10,15));
    }
}
