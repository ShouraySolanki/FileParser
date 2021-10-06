package parserApp;

import java.util.ArrayList;

public abstract class FileParser {

     protected abstract ArrayList<String> parseFile(String fileName, ArrayList<String> fieldData);
}
