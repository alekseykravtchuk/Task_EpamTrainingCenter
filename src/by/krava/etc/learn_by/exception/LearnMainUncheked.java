package by.krava.etc.learn_by.exception;

public class LearnMainUncheked {
    public static void main(String[] args) {
        String [] numbers = {"42", "0", "Y-", "33"};
        int result;
        int value = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                result = Integer.parseInt(numbers[i]);
                try {
                    sum += 100 / result;
                    Integer.parseInt("");
                }  catch (ArithmeticException e) {
                System.err.println(e);
            }

            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
        System.out.println(sum);
    }
}
