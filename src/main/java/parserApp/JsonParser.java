package parserApp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JsonParser extends FileParser {

   // String fileName;

    //String fieldname;
    /*JasonParser(String file_type,String file_path){
        super();
        this.fileName = fileName;

    }*/

    JsonParser(){

        super();
    }


    @Override
    protected ArrayList<String> parseFile(String fileName, ArrayList<String> fieldData) {
        ArrayList<String> result = new ArrayList<>();

        // parsing file "test_data.json"
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("src/main/resources/" + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;


        // getting firstName and lastName
       // String state_name = (String) jo.get("state_name");
        //String district_name = (String) jo.get("district_name");

        for (String data: fieldData){
           // if (data.getClass().getSimpleName() == "String") {
                String getdata = (String) jo.get(data);
                result.add(getdata);



        }



        //while (result.remove(null));

        result.removeIf(Objects::isNull);

        //result.add(state_name);
        //result.add(district_name);

        //System.out.println(state_name);
        //System.out.println( district_name);

        //System.out.println(result);


        return result;


    }
}
