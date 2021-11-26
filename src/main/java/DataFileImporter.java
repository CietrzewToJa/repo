import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataFileImporter implements DataImporter {

    @Override
    public List<String> importData(String source) {

        List<String> importedData = new ArrayList<>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(source));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.useDelimiter(System.getProperty("line.separator"));


        while(scanner.hasNext()) {
            importedData.add(scanner.next());
        }

        scanner.close();

        return importedData;
    }
}
