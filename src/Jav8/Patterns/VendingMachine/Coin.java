package Jav8.Patterns.VendingMachine;

public class Coin {
    private int weight;
    private String name;
    private int value;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Coin(String name){
        this.name = name;
        weight = name.equals("penny") ? CoinValidate.PENNY_WEIGHT :
                name.equals("quarter") ?  CoinValidate.QUARTER_WEIGHT : CoinValidate.SEMI_WEIGHT;
        value = name.equals("penny") ? CoinValidate.PENNY_VALUE :
                name.equals("quarter") ?  CoinValidate.QUARTER_VALUE : CoinValidate.SEMI_VALUE;
    }
}