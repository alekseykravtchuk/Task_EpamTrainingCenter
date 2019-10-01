package by.krava.etc.learn_by.collection;

public enum Country {
    ARMENIA(3, 28_470),
    BELARUS(9, 202_910),
    INDIA(1_370, 2_973_190),
    KAZAKHSTAN(18, 2_699_700),
    POLAND(38, 306_230),
    UKRAINE(43, 579_320);
    private int population;
    private int landArea;
    Country(int population, int landArea) {
        this.population = population;
        this.landArea = landArea;
    }

    public void grow(int additionalPopulation) {
        population += additionalPopulation;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }
}
