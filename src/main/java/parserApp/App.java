package parserApp;

import java.util.Scanner;

public class App {

    public static void main(String[]args){

        ParserInitializer parserInitializer = new ParserInitializer();
        FileParser fileParser = parserInitializer.InitializeParser("csv");
        
        Scanner sc = new Scanner(System.in);

        FileParser jasonObj = new JasonParser();
        System.out.println("Enter the file name: ");
        String fileName = sc.nextLine();

        fileParser.parsefile(fileName);

    }

}
