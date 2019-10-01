package by.krava.etc.learn_by.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
    public void f() throws IOException {}
}
class B extends A{
    @Override
    public void f() throws FileNotFoundException, InternalError {}
}

public class Test {
    public static void main(String[] args) {

    }
}