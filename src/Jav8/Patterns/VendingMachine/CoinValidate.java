package Jav8.Patterns.VendingMachine;

public interface CoinValidate {
    int PENNY_WEIGHT = 12;
    int QUARTER_WEIGHT = 3;
    int SEMI_WEIGHT = 6;
    int PENNY_VALUE = 100;
    int QUARTER_VALUE = 25;
    int SEMI_VALUE = 50;
    public boolean validate(Coin coin);
}
