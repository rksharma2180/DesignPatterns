package Creational.Singleton;

import sun.misc.Unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {

        Employee emp = Employee.getInstance();
        System.out.println(emp);

        Class<Employee> empClass = Employee.class;

        Constructor[] constructors = empClass.getDeclaredConstructors();

        Constructor constructor = constructors[0];
        for(Constructor con:constructors){
            System.out.println(con);
        }
        //Allocates an instance but does not run any constructor. Initializes the class if it has not yet been.
        // Another way of breaking singleton
        Object o = Unsafe.getUnsafe().allocateInstance(Employee.class);

        constructor.setAccessible(true);
        Employee emp1 = (Employee) constructor.newInstance();
        System.out.println(emp1.toString());
    }
}
