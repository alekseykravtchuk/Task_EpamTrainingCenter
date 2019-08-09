package by.krava.etc.unit4.aggregation_and_composition.t03_state;

public class City {
    private String name;
    private int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
