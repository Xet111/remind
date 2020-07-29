package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

public class FactoryFresh implements AbsFactory{
    @Override
    public Fish makeAFish() {
        return new FishFresh();
    }

    @Override
    public Meat makeAMeat() {
        return new MeatFresh();
    }
}
