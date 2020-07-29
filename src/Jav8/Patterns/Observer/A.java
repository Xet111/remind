package Jav8.Patterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class A implements Observer {
    @Override
    public void update(Observable observable, Object o) {
        int amount =  ((Amount)observable).getAmount();
        System.out.println("Amount A is " + amount);

    }
}
