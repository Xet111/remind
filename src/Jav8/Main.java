package Jav8;

import Jav8.Intensive.JavaSoundRecorder;
import Jav8.Intensive.SoundRecordingUtil;
import Jav8.Patterns.BuilderLesson.*;
import Jav8.Patterns.VendingMachine.Coin;
import Jav8.Patterns.VendingMachine.VendingMachine;
import Jav8.Patterns.FabricMethodLesson.DialogWeb;
import Jav8.Patterns.FabricMethodLesson.DialogWin;
import Jav8.Patterns.FabricMethodLesson.FactoryMethod;
import Jav8.Remind1Week.PatternsR.FactoryR.*;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;

import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//interface Parent{
//     public void eat(int i);
// }
 //class Child  implements Parent{
//
//     public void eat() {
//         System.out.println("Eat the father");
//     }
//     public void fart(){
//         System.out.println("Fart");
//     }
// }

class Main {


    private void predicate(ArrayList<Integer> list, Predicate predicate,
                           Consumer consumer){
        for (Integer i : list){
            if (predicate.test(i)){
                consumer.accept(i);
            }
        }
    }

    private static FactoryMethod factoryMethod;

    public void makeCar(){
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();

        ManualBuilder builder1 = new ManualBuilder();
        director.constructSportsCar(builder1);

        Manual manual = builder1.getResult();
        System.out.println(manual.getEngine());

    }

    public void initialize(String a){
        if (a.equals("Windows"))
            factoryMethod = new DialogWin();
        else
            factoryMethod = new DialogWeb();

    }

    public static void recordVoice(){
        int RECORD_TIME = 60000;
        File wavFile = new File("C:\\Users\\Home\\Desktop\\Intensive\\Record1.wav");

        final SoundRecordingUtil recorder = new SoundRecordingUtil();

        // create a separate thread for recording
        Thread recordThread = new Thread(() -> {
            try {
                System.out.println("Start recording...");
                recorder.start();
            } catch (LineUnavailableException ex) {
                ex.printStackTrace();
                System.exit(-1);
            }
        });

        recordThread.start();

        try {
            Thread.sleep(RECORD_TIME);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        try {
            recorder.stop();
            recorder.save(wavFile);
            System.out.println("STOPPED");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("DONE");

    }

    public void dropBoxRecordSound(){
        String ACCESS_TOKEN = "fhF7_HnqQyAAAAAAAAAADMpaIQvZiw6TdbhcJiA6Ts1Py6KeSRXFRly6HiitkeIV";
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        JavaSoundRecorder recorder = new JavaSoundRecorder(client);
        recorder.recordAudio(8000);

    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }

    public int sumOfNumber(int number){
        int res = 0;
        while(number != 0){
            res += number%10;
            number = number/10;
        }
        return res;
    }


    public static void main(String[] args) {
        List<Drink> list = new ArrayList<>();
        list.add(new CocaCola());
        list.add(new CocaCola());
        list.add(new SevenUp());
        VendingMachine vendingMachine = new VendingMachine(list);
        ArrayList<Coin> coins = new ArrayList<Coin>();
        coins.add(new Coin("penny"));
        coins.add(new Coin("penny"));
        coins.add(new Coin("quarter"));
        try {
            System.out.println(vendingMachine.vendingOperationMenu(5, coins).getName().getTitle());
            System.out.println(vendingMachine.vendingOperationMenu(1, coins).getName().getTitle());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}




