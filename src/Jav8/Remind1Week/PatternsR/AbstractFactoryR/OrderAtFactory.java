package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class OrderAtFactory {
    AbsFactory factory;
    public OrderAtFactory(AbsFactory factory){
        this.factory = factory;
    }

    public Meat getMeat(){
        return factory.makeAMeat();
    }
    public Fish getFish(){
       return factory.makeAFish();
    }
    public static OrderAtFactory order(TypeOfProduct type){
        if (type.equals(TypeOfProduct.FRESH) )
            return new OrderAtFactory(new FactoryFresh());
        else if (type.equals(TypeOfProduct.SALTY) )
            return new OrderAtFactory(new FactorySalty());
        else return null;
    }


}
