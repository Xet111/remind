package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

public class MeatSalty implements Meat{
    @Override
    public void rot() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Salty Meat is rotten");
    }
}
