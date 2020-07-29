package Jav8.Patterns.AbstractFactoryTest;

public class NoirFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ChairNoir();
    }

    @Override
    public Sofa createSofa() {
        return new SofaNoir();
    }
}
