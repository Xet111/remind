package Jav8.Remind1Week.PatternsR.FactoryR;

import static Jav8.Remind1Week.PatternsR.FactoryR.DrinkType.*;

public class FactoryR {

    public Drink wendingMachine(DrinkType typeOfDrink){
        switch (typeOfDrink){
            case COCA_COLA:
                return new CocaCola();
            case SEVEN_UP:
                return new SevenUp();
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfDrink);
        }
    }
}
