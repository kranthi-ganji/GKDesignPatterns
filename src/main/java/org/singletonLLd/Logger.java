package org.singletonLLd;

public class Logger {
    private static Logger logger = null;

    private Logger(){
        System.out.println("Logger object is instantiated");
    }

    public static Logger getInstance(){
        if(logger == null){
            synchronized(Logger.class){
                if(logger == null) logger = new Logger();
            }
        }
        return logger;
    }

    public  void log(LogLevel level,String message){
        String formattedMessage = LogFormatter.format(level, message);
        OutputHandler.writeToConsole(formattedMessage);
    }
}
