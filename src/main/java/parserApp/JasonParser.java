package parserApp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JasonParser extends FileParser {

   // String fileName;


    /*JasonParser(String file_type,String file_path){
        super();
        this.fileName = fileName;

    }*/

    JasonParser(){

        super();
    }


    @Override
    String parsefile(String fileName) {
        ArrayList<String> result = new ArrayList<>();

        // parsing file "test_data.json"
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("src/main/resources/" + fileName));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(e);

        }


        // typecasting obj to JSONObject
        JSONObject jo = (JSONObject) obj;

        // getting firstName and lastName
        String state_name = (String) jo.get("state_name");
        String district_name = (String) jo.get("district_name");

        result.add(state_name);
        result.add(district_name);

        //System.out.println(state_name);
        //System.out.println( district_name);

        System.out.println(result);

        return "";


    }
}
