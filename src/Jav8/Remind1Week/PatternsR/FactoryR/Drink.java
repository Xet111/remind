package Jav8.Remind1Week.PatternsR.FactoryR;

public abstract class Drink {
    int cost;
    DrinkType name;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public DrinkType getName() {
        return name;
    }

    public void setName(DrinkType name) {
        this.name = name;
    }
}
