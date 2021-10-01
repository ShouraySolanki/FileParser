package parserApp;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class JasonParser extends FileParser {

    String file_type;
    String file_path;


    JasonParser(String file_type,String file_path){
        super();
        this.file_type = file_type;
        this.file_path = file_path;
    }

    JasonParser(){
        super();
    }


    @Override
    String parsefile() {
        ArrayList<String> result = new ArrayList<>();

        // parsing file "test_data.json"
        Object obj = null;
        try {
            obj = new JSONParser().parse(new FileReader("test_data.json"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
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

        return result;


    }
}
