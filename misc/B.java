package misc;

public class B implements I {

    private String name;
    public B() {
        System.out.println("B constructor called");
    }

    public void print(){
        System.out.println("printing from B");
    }

    @Override
    public B getInstance() {
        return new B();
    }

    public String getName(){
        return name;
    }

}
