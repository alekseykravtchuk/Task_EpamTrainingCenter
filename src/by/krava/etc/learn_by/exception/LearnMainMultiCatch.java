package by.krava.etc.learn_by.exception;

public class LearnMainMultiCatch {
    public static void main(String[] args) {
        String [] numbers = {"42", "0", "Y-", "33"};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += 100;
            } catch (ArithmeticException | NumberFormatException e) {
               System.err.println(e);
            }
        }
        System.out.println(sum);
    }
}
