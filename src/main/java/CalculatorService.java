import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorService {

    private static final Logger LOGGER = Logger.getLogger(CalculatorApp.class.getName());

    public Double processData(List<String> data) {

        Double result = 0.0;

        Iterator<String> dataListIterator = data.iterator();

        if (dataListIterator.hasNext())
            result = Double.parseDouble(dataListIterator.next());

        while (dataListIterator.hasNext()) {
            String operator = dataListIterator.next();

            switch (operator) {
                case "ADD":
                    result = add(result, Double.parseDouble(dataListIterator.next()));
                    break;
                case "MULTIPLY":
                    result = multiply(result, Double.parseDouble(dataListIterator.next()));
                    break;
            }

            LOGGER.log(Level.INFO, "Result is: {0}", result);
        }

        return result;
    }

    Double add(Double x, Double y) {
        LOGGER.log(Level.INFO, "Operation is: {0} + {1}", new Object[]{x,y});
        return x + y;
    }

    Double multiply(Double x, Double y) {
        LOGGER.log(Level.INFO, "Operation is: {0} * {1}", new Object[]{x,y});
        return x * y;
    }
}
