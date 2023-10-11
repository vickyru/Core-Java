package java8.lambda.cpncept;

public class VehicalImplementation {

    public static void main(String[] args) {
        VehicalType obj = (value) -> {
            System.out.println("Vehical Type is: " + value);
            return value;
        };

        VehicalType obj2 = (value) -> value;

        obj.vehicalType("Sedan");

    }
}
