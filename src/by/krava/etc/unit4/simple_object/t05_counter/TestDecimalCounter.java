package by.krava.etc.unit4.simple_object.t05_counter;

public class TestDecimalCounter {

    public static void main(String[] args) {

        /* тест счетчика по умолчанию */
        DecimalCounter firstCounter = new DecimalCounter();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.reduce(): ");
        firstCounter.reduce();

        System.out.print("firstCounter.increase() * 99: ");
        for (int i = 1; i <= 99; i++) {
            firstCounter.increase();
        }
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Текущее значение счетчика №1 - " + firstCounter.getCurrentValue());
        System.out.println("\n");


        /* тест счетчика с заданных диапазоном значений */
        DecimalCounter secondCounter = new DecimalCounter(1, 1, 8);
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.reduce(): ");
        secondCounter.reduce();

        System.out.print("secondCounter.increase() * 6: ");
        for (int i = 1; i <= 6; i++) {
            secondCounter.increase();
        }
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Текущее значение счетчика №2 - " + secondCounter.getCurrentValue());
    }
}
