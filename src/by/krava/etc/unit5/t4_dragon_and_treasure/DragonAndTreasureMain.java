package by.krava.etc.unit5.t4_dragon_and_treasure;

import by.krava.etc.unit5.t4_dragon_and_treasure.entity.Cave;
import by.krava.etc.unit5.t4_dragon_and_treasure.entity.ConsoleMenu;

/**
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Приложение должно быть объектно-, а не процедурно-ориентированным.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения данных можно использовать файлы.
 * Дракон и его сокровища.  Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
 * дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
 * выбора сокровищ на заданную сумму.
 */

public class DragonAndTreasureMain {
    public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}
