package misc;

public interface I {

    public abstract void print();

    public static B getInstance(){
        return new B();
    };

}
