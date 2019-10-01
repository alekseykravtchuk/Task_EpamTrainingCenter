package by.krava.etc.learn_by.exception;

public class AssertMain {
    public static void main(String[] args) {
        int length = 1;
        assert (length <= 0) : "incorrect length = " + length;
        AssertMain as = new AssertMain();
        System.out.println(as.method());

    }

    int method (){
        return Integer.MAX_VALUE - Integer.MIN_VALUE;
    }
}
