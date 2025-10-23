package org.singleton;

public class EagerSingleton {
    private static final EagerSingleton eagersingleton = new EagerSingleton();
    //If we are not using this object then also it will take some memory in JVM (Memory wastage)

    //No one will be able to create the object of this class because of private constructor
    private EagerSingleton(){

    }

    public static EagerSingleton getEagersingleton() {
        return eagersingleton;
    }
}
