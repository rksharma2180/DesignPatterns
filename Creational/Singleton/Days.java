package Creational.Singleton;

import java.io.Serializable;

public enum Days implements Serializable {
    INSTANCE;

    public Days getInstance(){
        return INSTANCE;
    }

}
