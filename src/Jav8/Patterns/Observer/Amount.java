package Jav8.Patterns.Observer;

import java.util.Observable;

public class Amount extends Observable {
    private int amount = 0;

    public void amountPlus(){
        amount++;
        super.setChanged();
        super.notifyObservers();
    }

    public void setAmount(int amount) {
        this.amount = amount;
        super.setChanged();
    }

    public int getAmount() {
        return amount;
    }
}
