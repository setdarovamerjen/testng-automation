package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

   private static Properties properties;

   static {

       try( FileInputStream fileInputStream= new FileInputStream("src/test/resources/configurations.properties")) {
           properties= new Properties();
           properties.load(fileInputStream);
       } catch (IOException e) {
           System.out.println("File not found");
       }

    }

    public static String getValue(String key){
       return  properties.getProperty(key);
    }
}
