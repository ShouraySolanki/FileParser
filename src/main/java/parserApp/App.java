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
        ArrayList<String> fieldData = new ArrayList<>();
        boolean End = false;
        while (End == false){

            String fieldName = sc.nextLine();
            fieldData.add(fieldName);
            if (fieldName.isEmpty()){
                End = true;
            }
        }

        System.out.println(fileParser.parseFile(fileName, fieldData));


    }

}
