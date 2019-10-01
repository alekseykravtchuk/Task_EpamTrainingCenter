package by.krava.etc.learn_by.exception;

public class LearnMainThrow {
    public static void main(String[] args) {
        int a = -42;
        if (a <= 0) {
            throw new IllegalArgumentException("argument cannot be less than zero");
        }
        double res = Math.pow(a, 2);
    }


}
