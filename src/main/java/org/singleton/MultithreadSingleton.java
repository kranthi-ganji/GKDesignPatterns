package org.singleton;

public class MultithreadSingleton {
    private static  MultithreadSingleton instance= null;
    // Make the method which returns the instance  as synchronised,then only one thread able to call this method
    //Long waiting --- we can use synchronise blocks rather than synchronise methods

    //No one will be able to create the object of this class because of private constructor
    private MultithreadSingleton(){

    }

    public static MultithreadSingleton getInstance(){
        if(instance == null){ // till here multiple threds can come
            //Method is static here so we have class level locking here
            synchronized (MultithreadSingleton.class){
                //1st thread will come here and creates the instance
                //2n thread will come here, waits because thread1 is lock,then thread1 create the instance and releases the lock
                // then thread 2 checks if instance is null --> no then it will return existing one
                if(instance == null){ // only one thread will go here
                    instance = new MultithreadSingleton();
                }
            }
        }
        return instance;
    }
}
/*
public static synchronized Singleton getInstance() {
    if (instance == null) {
        instance = new Singleton();
    }
    return instance;
}
--> Thread-safe
--> But slow, because synchronization happens every time we call getInstance(),
    even after the instance is already created.
*/
/* Why double check
    Thread A enters getInstance(), sees instance == null, goes inside the synchronized block.
    Thread B also calls getInstance() at the same time.
    It sees instance == null (first check) but waits for the lock.
    Thread A creates the Singleton and releases the lock.
    Thread B now acquires the lock and performs the second check.
    Now instance != null, so it does not create a new one.
    --> Only one instance is ever created.
    --> Synchronization happens only once (first time).
*/
