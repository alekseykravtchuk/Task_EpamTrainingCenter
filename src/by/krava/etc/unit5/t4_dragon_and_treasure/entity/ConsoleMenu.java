package by.krava.etc.unit5.t4_dragon_and_treasure.entity;

import by.krava.etc.unit5.t4_dragon_and_treasure.action.ConsoleMenuAction;

public class ConsoleMenu {
    private ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();

    public void startConsoleMenu(){
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }
}
