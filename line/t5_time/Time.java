package by.tasks.part1.line.t5_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */

public class Time {
    public static void main(String[] args) throws IOException {
        int hour, min, sec;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длительность прошедшего времени в секундах:");
        sec = Integer.parseInt(br.readLine());
        hour = sec / 3600;
        min = sec / 60 - hour * 60;
        sec -= (hour * 3600 + min * 60);
        System.out.printf("%dч %dмин %dc%n", hour, min, sec);
    }
}