package org.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
    private static SerializableSingleton instance = null;
    private SerializableSingleton(){

    }

    public static SerializableSingleton getInstance(){
        if (instance == null) instance = new SerializableSingleton();
        return instance;
    }

    // To save the singleton design pattren during the serialization we have to override the readResolve method
    //This method will call during the de-serialization by the JVM
    protected Object readResolve(){
        return instance;
    }
}
