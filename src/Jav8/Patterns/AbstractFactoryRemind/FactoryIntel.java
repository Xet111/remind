package Jav8.Patterns.AbstractFactoryRemind;

public class FactoryIntel implements AbstractFactoryR {
    @Override
    public Computer createComputer() {
        return new ComputerIntel();
    }

    @Override
    public TV createTV() {
        return new TVIntel();
    }
}
