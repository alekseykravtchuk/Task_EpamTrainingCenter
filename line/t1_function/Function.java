package by.tasks.part1.line.t1_function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Function {
    public static void main(String[] args) throws IOException {
        double z, a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение \"а\":");
        a = Double.parseDouble(br.readLine());
        System.out.println("Введите значение \"b\":");
        b = Double.parseDouble(br.readLine());
        System.out.println("Введите значение \"c\":");
        c = Double.parseDouble(br.readLine());
        z = ( (a - 3 ) * b / 2) + c;
        System.out.println("Значение z = " + z);
    }
}
