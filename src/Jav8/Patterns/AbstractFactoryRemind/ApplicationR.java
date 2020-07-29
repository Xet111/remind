package Jav8.Patterns.AbstractFactoryRemind;

public class ApplicationR {
    private AbstractFactoryR factoryR;
    private Computer computer;
    private TV tv;

    public ApplicationR(AbstractFactoryR factoryR){
        this.factoryR = factoryR;
    }
    public Computer createComputer(){
        return factoryR.createComputer();
    }
    public TV createTV(){
        return factoryR.createTV();
    }
}
