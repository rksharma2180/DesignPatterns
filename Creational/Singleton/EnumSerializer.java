package Creational.Singleton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EnumSerializer {
    public static void main(String[] args) throws Exception {
        Days instance = Days.INSTANCE;
        File file = new File(".\\days.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(instance);
        oos.close();
    }
}
