package parserApp;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[]args){

        //FileParser jsnobj = new JasonParser();
        //jsnobj.parsefile("test1.json");


        Scanner sc = new Scanner(System.in);

        ParserInitializer parserInitializer = new ParserInitializer();

        System.out.println("Enter the FileType: ");
        String filetype = sc.nextLine();
        FileParser fileParser = parserInitializer.InitializeParser(filetype);
        



        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.println("enter the required field: ");
        ArrayList<String> field_data = new ArrayList<>();
        boolean End = false;
        while (End == false){

            String fieldname = sc.nextLine();
            field_data.add(fieldname);
            if (fieldname.isEmpty()){
                End = true;
            }
        }

        System.out.println(fileParser.parsefile(fileName, field_data));


    }

}
