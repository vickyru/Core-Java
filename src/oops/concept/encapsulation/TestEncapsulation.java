package oops.concept.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.setName("Prashant");
        encap.setRollNumber(101);
        encap.setSchool("Times Kids");
        System.out.println("My Name is : " + encap.getName());
        System.out.println("My roll number is : " + encap.getRollNumber());
        System.out.println("My School name is : " + encap.getSchool());
    }
}
