package Jav8.Remind1Week.PatternsR.AdapterR;

import org.json.*;

public class JsonParser {

    public void ParseJson(String json){
        JSONObject object = new JSONObject(json);
        String name = object.getString("name");
        int age = object.getInt("age");
        System.out.println(name + " - " + age);
    }
}
