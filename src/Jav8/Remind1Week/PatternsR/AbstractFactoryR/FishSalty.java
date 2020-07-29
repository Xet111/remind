package Jav8.Remind1Week.PatternsR.AbstractFactoryR;

public class FishSalty implements Fish{
    @Override
    public void rot() {
        try {
            Thread.sleep(6000);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("Salty Fish is rotten");
    }
}
