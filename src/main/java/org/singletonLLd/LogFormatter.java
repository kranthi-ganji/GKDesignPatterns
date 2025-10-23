package org.singletonLLd;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class LogFormatter {
    public static String format(LogLevel level,String message){
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return "[" + timestamp + "] [" +level + "] " + message;
    }
}
