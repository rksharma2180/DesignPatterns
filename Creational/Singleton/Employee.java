package Creational.Singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class Employee implements Cloneable, Serializable {
    private static int i = 1;
    private static Employee emp = new Employee();
    private Employee() {

        if (Objects.nonNull(emp)){
            throw new UnsupportedOperationException();
        }
        System.out.println(i++);
    }

    public static Employee getInstance(){
        return emp;
    }
    public String toString() {
        return "Employee class Instantiated ";
    }

    @Override
    public Employee clone() {
        try {
            throw new CloneNotSupportedException();
            //Employee clone = (Employee) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    private Object readResolve() throws java.io.ObjectStreamException { return getInstance(); }
}
