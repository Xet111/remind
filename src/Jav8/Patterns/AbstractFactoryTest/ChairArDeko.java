package Jav8.Patterns.AbstractFactoryTest;

public class ChairArDeko implements Chair {
    @Override
    public void create() {
        System.out.println("ArDeko chair");
    }
}
