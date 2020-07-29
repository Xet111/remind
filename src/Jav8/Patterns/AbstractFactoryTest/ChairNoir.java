package Jav8.Patterns.AbstractFactoryTest;

public class ChairNoir implements Chair {
    @Override
    public void create() {
        System.out.println("Noir chair");
    }
}
