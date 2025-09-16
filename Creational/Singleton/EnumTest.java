package Creational.Singleton;

import sun.misc.Unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumTest {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        //new Days();//Enum types cannot be instantiated

        Days instance = Days.INSTANCE;

        Object o = Unsafe.getUnsafe().allocateInstance(Days.class);//Exception in thread "main" java.lang.SecurityException: Unsafe

        Class<Days> cls = Days.class;

        for (Constructor<?> declaredConstructor : cls.getDeclaredConstructors()) {
            System.out.println("Declared Constructor:"+declaredConstructor);
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance();//Cannot reflectively create enum objects
        }
        System.out.println("Program Ended");
    }
}
