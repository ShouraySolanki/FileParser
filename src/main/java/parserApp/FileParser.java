package parserApp;

import java.util.ArrayList;

public abstract class FileParser {

     protected abstract ArrayList<String> parsefile(String fileName, ArrayList<String> field_data);
}
