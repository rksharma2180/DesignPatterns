package Creational.Singleton;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EnumDeserializer {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("days.txt"));
        Days deserialized = (Days) ois.readObject();
        ois.close();

        System.out.println("Original: " + Days.INSTANCE.hashCode());
        System.out.println("Deserialized: " + deserialized.hashCode());
        //Even without readResolve(), the JVM guarantees that deserialized == Employee.INSTANCE.
        System.out.println("Same instance? " + (Days.INSTANCE == deserialized));

    }
}
