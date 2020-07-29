package Jav8.Patterns.AbstractFactoryTest;

public class SofaNoir implements Sofa {
    @Override
    public void create() {
        System.out.println("Noir sofa");
    }
}
