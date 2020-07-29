package Jav8.Intensive;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import javax.sound.sampled.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaSoundRecorder
{
    private final static String ACCESS_TOKEN = "fhF7_HnqQyAAAAAAAAAADMpaIQvZiw6TdbhcJiA6Ts1Py6KeSRXFRly6HiitkeIV";
    private AudioFileFormat.Type fileType;
    private TargetDataLine line;
    private DataLine.Info info;
    private AudioFormat format;
    private String fileName;

    private DbxClientV2 client;

    public JavaSoundRecorder(DbxClientV2 client)
    {
        this.client = client;
        fileType = AudioFileFormat.Type.WAVE;
        format = getAudioFormat();
        info = new DataLine.Info(TargetDataLine.class, format);
    }

    /**
     * Defines an audio format
     */
    AudioFormat getAudioFormat() {
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                channels, signed, bigEndian);
        return format;
    }

    private void createFileName(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        fileName = simpleDateFormat.format(date) + ".wav";
    }

    public void recordAudio(int milliseconds)
    {
        //TODO: using SimpleDateFormat create name
        // in format: 20200724_201906.wav



        start();
        finish(milliseconds);
    }

    private void start()
    {
        createFileName();
        File wavFile = new File(fileName);
        Thread thread = new Thread(() -> {
            try {
                line = (TargetDataLine) AudioSystem.getLine(info);
                line.open(format);
                line.start();
                AudioInputStream ais = new AudioInputStream(line);
                AudioSystem.write(ais, fileType, wavFile);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        thread.start();
    }

    private void finish(int milliseconds)
    {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(milliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            line.stop();
            line.close();

            //TODO: upload file to Dropbox
            //  and then remove the file from disk
            uploadToDropBox();

        });
        thread.start();
    }
    private void deleteFile(){

        File file = new File("F:/MY papka/COurses/remind/"+fileName);
        try {
            if(file.exists()) {
                boolean bool = file.delete();
                System.out.println(bool);
            }
            else System.out.println("Nema");
        }
        catch (Exception exception){
            exception.printStackTrace();
        }

    }

    private void uploadToDropBox(){
            try {
                InputStream in = new FileInputStream("F:\\MY papka\\COurses\\remind\\"+ fileName);
                FileMetadata metadata = client.files().uploadBuilder("/"+fileName)
                        .uploadAndFinish(in);
                in.close();

                deleteFile();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
    }
}