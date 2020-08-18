package Jav8.String;

import Jav8.Remind1Week.PatternsR.AdapterR.JsonParser;
import com.google.gson.Gson;
import sun.net.www.protocol.https.HttpsURLConnectionImpl;

import java.io.*;
import java.net.*;

public class WikipediaAPI {
    private final static String con = "Хуй";

   static String input = con;

    private final static String WIKI_LINK =
            "https://ru.wikipedia.org/wiki/" + input;

   static String str;
   static
    {
        try {
            str = URLEncoder.encode(WIKI_LINK, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void wikiExplore(){
        try {
            URL url = new URL(WIKI_LINK);
            URLConnection urlConnection = url.openConnection();
//            InputStream urlConnection = url.openConnection().getInputStream();
//            Reader reader = new InputStreamReader(urlConnection);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                    urlConnection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
//            JsonParser parser = new JsonParser();
//            parser.ParseJson(reader.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
