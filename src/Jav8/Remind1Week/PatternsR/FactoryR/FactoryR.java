package Jav8.Remind1Week.PatternsR.FactoryR;

import Jav8.Exceptions.ProductNotFoundException;
import Jav8.Patterns.VendingMachine.VendingMachine;

public class FactoryR {

    public Drink wendingMachine(DrinkType typeOfDrink, VendingMachine vendingMachine) throws ProductNotFoundException{
        for(Drink drink : vendingMachine.getProducts()){
            if (drink.name == typeOfDrink){
                return drink;
            }
        }
        throw new ProductNotFoundException("Sorry, there is no such product at the time");
    }
}
