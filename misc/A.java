package misc;

public class A {

    public A() {
        System.out.println("B constructor called");
    }

    public static void main(String[] args) {
        I b = I.getInstance();
        b.print();


    }
}
