package org.singletonLLd;

public class Main {
    public static void main(String args[]){
        Logger obj = Logger.getInstance();
        obj.log(LogLevel.INFO,"Application started");
        obj.log(LogLevel.ERROR,"Error has occured");
        obj.log(LogLevel.INFO,"Application started");
        obj.log(LogLevel.ERROR,"Error has occured");
        obj.log(LogLevel.INFO,"Application started");
        obj.log(LogLevel.ERROR,"Error has occured");
        obj.log(LogLevel.INFO,"Application started");
        obj.log(LogLevel.ERROR,"Error has occured");


    }
}
