package by.krava.etc.learn_by.collection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    public Properties loadFile(String filename) {
        Properties properties = new Properties();
        properties.put("submit", "Submit_A");
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
