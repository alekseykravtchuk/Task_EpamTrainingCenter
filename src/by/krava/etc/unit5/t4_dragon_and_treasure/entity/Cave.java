package by.krava.etc.unit5.t4_dragon_and_treasure.entity;

import by.krava.etc.unit5.t4_dragon_and_treasure.action.ConsoleMenuAction;
import by.krava.etc.unit5.t4_dragon_and_treasure.action.TreasureAction;

import java.util.List;

public class Cave {
    private String name;
    private int numberOfTreasure;
    private static List<Treasure> treasures;
    private TreasureAction treasureAction;

    public Cave(String name, int numberOfTreasure) {
        this.name = name;
        this.numberOfTreasure = numberOfTreasure;
        treasureAction = new TreasureAction();
        treasures = treasureAction.fillCaveWithTreasures(numberOfTreasure);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTreasure() {
        return numberOfTreasure;
    }

    public void setNumberOfTreasure(int numberOfTreasure) {
        this.numberOfTreasure = numberOfTreasure;
    }

    public static List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }
}
