package Jav8.Patterns.VendingMachine;


import Jav8.Exceptions.ProductException;
import Jav8.Remind1Week.PatternsR.FactoryR.Drink;
import Jav8.Remind1Week.PatternsR.FactoryR.DrinkType;

import java.io.IOException;
import java.util.List;

public class VendingMachine {
    private int moneyBank;
    public List<Drink> getProducts() {
        return products;
    }
    public void setProducts(List<Drink> products) {
        this.products = products;
    }
    public int getMoneyBank() {
        return moneyBank;
    }
    public VendingMachine(List<Drink> products) {
        this.moneyBank = 0;
        this.products = products;
    }
    public void setMoneyBank(int moneyBank) {
        this.moneyBank = moneyBank;
    }
    private boolean moneyCheck(Coin coin){
        CoinValidate coinValidate = coin1 -> coin1.getWeight() == CoinValidate.PENNY_WEIGHT ||
                coin1.getWeight() == CoinValidate.QUARTER_WEIGHT ||
                coin1.getWeight() == CoinValidate.SEMI_WEIGHT;
        return coinValidate.validate(coin);
    }
    private int moneyInsert(Coin coin) throws IOException {
        int tempMoneyBank = moneyBank;
        if (!moneyCheck(coin))
            throw new IOException();
        else {
            setMoneyBank(getMoneyBank() + getCoinValue(coin));
        }
        return moneyBank - tempMoneyBank;
    }
    private List<Drink> products;
    public Drink vendingOperationMenu(int code, List<Coin> coins) throws Exception {
        int balance = 0;
        for(Coin coin : coins){
            try {
                balance = balance + moneyInsert(coin);
            }
            catch (IOException e){
                e.getStackTrace();
            }
            Drink vendingDrink = null;
            for(Drink drink1 : getProducts()){
                if(drink1.getName().getCode() == code){
                    vendingDrink =  drink1;
                }
            }
            assert vendingDrink != null;
            if(balance >= vendingDrink.getCost()){
                balance = balance - vendingDrink.getCost();
                return vendingDrink;
            }
        }
                throw new Exception();
    }
    private int getCoinValue(Coin coin){
        return coin.getWeight() == CoinValidate.PENNY_WEIGHT ? CoinValidate.PENNY_VALUE :
                coin.getWeight() == CoinValidate.SEMI_WEIGHT ? CoinValidate.SEMI_VALUE : CoinValidate.QUARTER_VALUE;
    }
}