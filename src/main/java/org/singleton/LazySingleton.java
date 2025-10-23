package org.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton lazysingleton = null;


    //No one will be able to create the object of this class because of private constructor
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){              // MultiThreaded is not possible here
        if(lazysingleton == null){
            lazysingleton = new LazySingleton();
        }
        return lazysingleton;
    }
}
