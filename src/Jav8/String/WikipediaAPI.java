package Jav8.String;

import Jav8.Remind1Week.PatternsR.AdapterR.JsonParser;
import com.google.gson.Gson;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.*;
import java.net.*;

public class WikipediaAPI {
    private final static String WIKI_LINK = "https://ru.wikipedia.org/wiki/";

    public static void wikiExplore(String input){
        try {
            URL url = new URL(WIKI_LINK + input);
            URLConnection urlConnection = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                    urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
