package parserApp;


public class ParserInitializer {

    public FileParser InitializeParser(String file_type){

//        String fileName;

        if (file_type == null || file_type.isEmpty())
            return null;
        if ("JSON".equals(file_type)) {


            return new JasonParser();
        }
        else if ("csv".equals(file_type)) {


            return new csvParser();
        }

        return null;

    }
}
