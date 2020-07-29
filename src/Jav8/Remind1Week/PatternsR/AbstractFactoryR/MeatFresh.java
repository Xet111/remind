package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

public class MeatFresh implements Meat{
    @Override
    public void rot() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fresh Meat rotten");
    }
}
