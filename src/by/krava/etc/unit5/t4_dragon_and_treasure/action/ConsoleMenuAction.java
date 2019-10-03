package by.krava.etc.unit5.t4_dragon_and_treasure.action;

import java.util.Scanner;

public class ConsoleMenuAction {

    public void printOptions() {
        String menuText = "Available operations:\n" +
                "1 - Show all treasures;\n" +
                "2 - Choose the most expensive treasure;\n" +
                "3 - Select treasures for a given amount;\n" +
                "4 - Close application.";
        System.out.println(menuText);
    }

    public int makeChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("There is no such option. Repeat entry.\n");
            } else {
                return choice;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.\n");
        }
        return -1;
    }

    public boolean processingOperation(int choice) {
        TreasureAction treasureAction = new TreasureAction();
        switch (choice){
            case 1:
                treasureAction.showAllTreasure();
                break;
            case 2:
                treasureAction.chooseMostExpensive();
                break;
            case 3:
                treasureAction.selectForGivenAmount();
                break;
            case 4:
                System.out.println("The work is completed.\nGoodbye");
                return true;
        }
        return false;
    }
}
