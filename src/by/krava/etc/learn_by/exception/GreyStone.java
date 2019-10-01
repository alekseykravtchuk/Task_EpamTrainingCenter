package by.krava.etc.learn_by.exception;

import java.io.FileWriter;
import java.io.IOException;

public class GreyStone {

    public void accept(String data) throws IOException {
        FileWriter fileWriter = new FileWriter("data");
    }
}
