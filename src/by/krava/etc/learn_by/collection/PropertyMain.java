package by.krava.etc.learn_by.collection;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {
    public static void main(String[] args) throws IOException {
        PropertyLoader loader = new PropertyLoader();
        Properties properties = loader.loadFile("datares/message.properties");
        properties.list(System.out);
        String label = properties.getProperty("label");
        String value = properties.getProperty("abc");
        properties.put("button", "Button_B");
        String valueDafault = properties.getProperty("xyz", "Y-");
//        System.out.println(value + " " + valueDafault);
        properties.store(new FileWriter("data/messages2.properties"), "Comment Prop");
    }
}
