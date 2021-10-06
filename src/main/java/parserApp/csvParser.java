package parserApp;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class csvParser extends FileParser{
    private String fileName;

    /*
        String file_type;
        String file_path;


        csvParser(String file_type,String file_path){
            super();
            this.file_type = file_type;
            this.file_path = file_path;
        }
    */
    csvParser(){
        super();
    }


    @Override
    protected ArrayList<String> parsefile(String fileName, ArrayList<String> field_data) {
        this.fileName = fileName;

        ArrayList<String> result = new ArrayList<>();

        try {
            // Create an object of file reader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader("src/main/resources/" + fileName);

            // create csvReader object and skip first Line
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();
            List<String[]> allData = csvReader.readAll();

            // print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    result.add(cell + "\t");
                    //System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    return result;

    }

}
