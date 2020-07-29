package Jav8.Patterns.AbstractFactoryTest;

public class SofaArDeko implements Sofa {
    @Override
    public void create() {
        System.out.println("ArDeko sofa");
    }
}
