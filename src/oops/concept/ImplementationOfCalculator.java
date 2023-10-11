package oops.concept;

public class ImplementationOfCalculator implements InterfaceCalculator {
    int x = 15;
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    private void print(){
        System.out.println("Print of implementation class");
    }

    public static void main(String[] args) {
        ImplementationOfCalculator calculator = new ImplementationOfCalculator();
        System.out.println("add => " + calculator.add(InterfaceCalculator.a, InterfaceCalculator.b));
        System.out.println("sub => " + calculator.sub(InterfaceCalculator.a, InterfaceCalculator.b));
        System.out.println("div => " + calculator.div(InterfaceCalculator.a, InterfaceCalculator.b));
        System.out.println("mul => " + calculator.mul(InterfaceCalculator.a, InterfaceCalculator.b));

        // More testing
        InterfaceCalculator obj = new ImplementationOfCalculator(); // upcasting example
//        obj.print()  // Can't resolve the print
//        obj.x;    // Can't resolve the x

        ImplementationOfCalculator obj2 = new ImplementationOfCalculator();
        obj2.print();   //possible
        System.out.println(obj2.x); // possible

    }
}
