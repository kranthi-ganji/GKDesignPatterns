package org.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //exampleSerialization();
        exampleReflection();
    }
    public static void exampleSerialization() throws IOException, ClassNotFoundException {
        LazySingleton lazySingleton = LazySingleton.getInstance();

        //Serialization part
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("obj1.obj"));
        objectOutputStream.writeObject(lazySingleton);
        objectOutputStream.close();

        //De- Serialization part
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("obj1.obj"));
        LazySingleton deserialObject = (LazySingleton) objectInputStream.readObject();
        //objectInputStream.close();

        System.out.println("Object 1 " + lazySingleton.hashCode());
        System.out.println("Object 1 " + deserialObject.hashCode());


        // To fix Add a readResolve() method to return the existing instance
        SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();

        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream("obj2.obj"));
        objectOutputStream2.writeObject(serializableSingleton);
        objectOutputStream2.close();

        ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("obj2.obj"));
        SerializableSingleton deserialInstance = (SerializableSingleton) objectInputStream2.readObject();
        objectInputStream2.close();

        System.out.println("SerializableSingleton " + serializableSingleton.hashCode());
        System.out.println("SerializableSingleton " + deserialInstance.hashCode());
    }

    //Breaking the singleton  design pattern using the reflections
    //By reflection we can get access to all the methods,variables and constructors in the class

    public static void exampleReflection() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0]; // we know we have only one constructor
        constructor.setAccessible(true); // bypass private
        LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();

        System.out.println("Reflected hasCode              : " + lazySingleton.hashCode());
        System.out.println("LazySingleton instance hasCode : " + instance.hashCode());

        //Solution to this Add a check in the private constructor:
        //     private Singleton() {
        //        if (instance != null) {
        //            throw new RuntimeException("Use getInstance() method");
        //        }
        //    }

    }
}
