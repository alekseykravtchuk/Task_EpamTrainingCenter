package by.krava.etc.learn_by.exception;

public class LearnMainException {
    public static void main(String[] args) {
//        int b = 0;
//        if (b != 0) {
//        try {
//            int value = 1 / 0;
//        } catch (ArithmeticException e) {
//            System.err.println(e);
//        }
//        System.out.println("\nend");

//        int [] array = {};
//        int value = array[0];
        Object object = new Object();
        if (object != null) {
            object.getClass();
            System.out.println("1");
        }

    }
}
