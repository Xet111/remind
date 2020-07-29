package Jav8.Patterns.AbstractFactoryTest;

public class Application {
    private AbstractFactory factory;
    private Chair chair;
    private Sofa sofa;
    public Application(AbstractFactory factory){
        this.factory = factory;
    }
    public void createChair(){
        this.chair = factory.createChair();
    }
    public void createSofa(){
        this.sofa = factory.createSofa();
    }
    public void deliverSofa(){

        sofa.create();
    }
    public void  deliverChair(){
        chair.create();
    }

    public AbstractFactory getFactory() {
        return factory;
    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }
}
