package by.krava.etc.unit5.t4_dragon_and_treasure.action;

import by.krava.etc.unit5.t4_dragon_and_treasure.entity.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureAction {

    void showAllTreasure() {
        int id = 1;
        for (Treasure element : Cave.getTreasures()) {
            System.out.println(String.format("%-3d %-100s", id++, element));
        }
        System.out.println();
    }

    public void chooseMostExpensive() {

    }

    public void selectForGivenAmount() {

    }

    public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {
        List<Treasure> treasures = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("data/treasure_list.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String [] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int treasureValue = Integer.parseInt(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                switch (treasureType) {
                    case "Chine Porcelain":
                        treasures.add(new ChinesePorcelain(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Necklace":
                        treasures.add(new Necklace(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Combat Weapon":
                        treasures.add(new CombatWeapon(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return treasures;
    }
}
