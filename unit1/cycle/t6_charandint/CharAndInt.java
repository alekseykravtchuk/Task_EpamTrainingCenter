package by.krava.etc.unit1.cycle.t6_charandint;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class CharAndInt {

    public static void main(String[] args) {
       for (int i = 1; i < 1424; i++) {
           if (!(i == 10 || i == 13)) {
               System.out.printf("%3s - %4d %3s", (char) (i), i, "");
           }

           if (i % 10 == 0) {
               System.out.println();
           }
       }
    }
}
