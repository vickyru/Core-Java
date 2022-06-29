package oops.concept.overiding;

public class TestOveriding {
    public static void main(String[] args) {
        Vehical vehical = new Vehical();
        vehical.canTravelOn();

        Vehical vehicalcar = new Car();
        vehicalcar.canTravelOn();
    }
}
