package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

public class FactorySalty implements AbsFactory{
    @Override
    public Fish makeAFish() {
        return new FishSalty();
    }

    @Override
    public Meat makeAMeat() {
        return new MeatSalty();
    }
}
