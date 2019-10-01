package by.krava.etc.learn_by.exception;

public class StaticExceptionMain {
    final static int value;
    static {
        value = Integer.parseInt("Y-");
    }

    public static void main(String[] args) {
        int a = value;
    }
}
