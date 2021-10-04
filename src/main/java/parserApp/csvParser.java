package parserApp;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class csvParser extends FileParser{
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
    String parsefile(String fileName) {

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
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    return "";

    }

}
