package by.krava.etc.unit4.simple_object.t05_counter;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите инициа-
 * лизацию счетчика значениями по умолчанию и произвольными значениями. Счетчик
 * имеет методы увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

class DecimalCounter {
    private int currentValue;
    private int minValue;
    private int maxValue;

    DecimalCounter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    DecimalCounter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return this.currentValue;
    }

    void increase() {
        currentValue++;
        if(currentValue == maxValue) {
            System.out.println("Достигнута верхняя граница диапазона");
        } else if (currentValue > maxValue) {
            System.out.println("Недопустимый выход за верхнюю границу диапазона");
            currentValue--;
        }
    }

    void reduce() {
        currentValue--;
        if(currentValue == maxValue) {
            System.out.println("Достигнута нижняя граница диапазона");
        } else if (currentValue < minValue) {
            System.out.println("Недопустимый выход за нижнюю границу диапазона");
            currentValue++;
        }
    }
}
