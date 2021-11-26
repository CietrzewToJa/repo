import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorApp {

    static DataImporter dataImporter = new DataFileImporter();
    static CalculatorService calculatorService = new CalculatorService();
    private static final Logger LOGGER = Logger.getLogger(CalculatorApp.class.getName());

    public static void main(String[] args) {

        List<String> importedData = new ArrayList<>();

        importedData = dataImporter.importData(args[0]);
        Double result = calculatorService.processData(importedData);

        LOGGER.log(Level.INFO, "The Final Result is: {0}", result);
    }
}
