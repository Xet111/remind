package Jav8.Patterns.AbstractFactoryRemind;

public class FactorySamsung implements AbstractFactoryR {
    @Override
    public Computer createComputer() {
        return new ComputerSamsung();
    }

    @Override
    public TV createTV() {
        return new TVSamsung();
    }
}
