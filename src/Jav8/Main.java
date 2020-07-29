package Jav8;

import Jav8.Collections.CollectionsClass;
import Jav8.Generics.GenericsL;
import Jav8.Intensive.JavaSoundRecorder;
import Jav8.Intensive.MyThread;
import Jav8.Intensive.SoundRecordingUtil;
import Jav8.Patterns.BuilderLesson.*;
import Jav8.Patterns.FabricMethodLesson.DialogWeb;
import Jav8.Patterns.FabricMethodLesson.DialogWin;
import Jav8.Patterns.FabricMethodLesson.FactoryMethod;
import Jav8.Remind1Week.PatternsR.AbstractFactoryR.OrderAtFactory;
import Jav8.Remind1Week.PatternsR.AbstractFactoryR.TypeOfProduct;
import Jav8.Remind1Week.PatternsR.AdapterR.JsonParser;
import Jav8.Remind1Week.PatternsR.AdapterR.JsonReader;
import Jav8.Remind1Week.PatternsR.FactoryR.DrinkType;
import Jav8.Remind1Week.PatternsR.FactoryR.FactoryR;
import Jav8.Sorting.SortMethods;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import javax.sound.sampled.LineUnavailableException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


 interface Parent{}
 class Child  extends Main implements Parent{ }

class Main {

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
        if (a == "Windows")
            factoryMethod = new DialogWin();
        else
            factoryMethod = new DialogWeb();

    }
    public static void recordVoice(){
        int RECORD_TIME = 60000;
        File wavFile = new File("C:\\Users\\Home\\Desktop\\Intensive\\Record1.wav");

        final SoundRecordingUtil recorder = new SoundRecordingUtil();

        // create a separate thread for recording
        Thread recordThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Start recording...");
                    recorder.start();
                } catch (LineUnavailableException ex) {
                    ex.printStackTrace();
                    System.exit(-1);
                }
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


    public static void main(String[] args) {
//        String json = "{ \"name\": \"Alice\", \"age\": 20}";
//        JsonParser parser = new JsonParser();
//        JsonReader.JsonRead(parser, json);
        
    }
}






















//Охуенность темы в том, что даже в глухом одиночестве можно себе устроить порядочный вечерок, спасибо за это
//https://live.skillbox.ru/webinars/code/zapisyvaem-zvuk-i-zagruzhaem-v-dropbox1/?utm_source=expertsender&utm_medium=email&utm_campaign=all_all_expertsender_email_invite1_intensive-116-2020-07_all_code_skillbox&utm_content=2020-07-24&utm_term=intensive&email=28compasov%40gmail.com