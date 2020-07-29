package Jav8.Patterns.AbstractFactoryTest;

public class ArDekoFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ChairArDeko();
    }

    @Override
    public Sofa createSofa() {
        return new SofaArDeko();
    }
}
