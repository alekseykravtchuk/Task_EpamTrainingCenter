package by.krava.etc.unit4.simple_object.t02_test2;

public class CheckTest2 {

    public static void main(String[] args) {
        Test2 one = new Test2(12, 4);
        Test2 two = new Test2();

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());

        System.out.println("\nСмена переменных:");
        one.setA(20);
        one.setB(5);

        System.out.println("one A: " + one.getA());
        System.out.println("one B: " + one.getB());
        System.out.println();
        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());

        System.out.println("\nСмена переменных:");
        two.setA(21);
        two.setB(2);

        System.out.println("two A: " + two.getA());
        System.out.println("two B: " + two.getB());
    }
}
