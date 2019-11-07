package Tasks.UltimateGoal;

import Numbers.Digit;
import Tasks.Task1.Numbers;
import Tasks.Task2.ExtendedOperations;
import Tasks.Task3.ExtendedNumbers;
import Tasks.Task4.AdvancedOperations;

/**
 * Converts string into Digit
 */
public class Convertor {

    public static Digit convertor(String stringNumbers){
        String reversed = new StringBuilder(stringNumbers).reverse().toString();
        Numbers numbers = new Numbers();

        AdvancedOperations position = new AdvancedOperations(numbers.one());
        AdvancedOperations result = new AdvancedOperations(numbers.zero());

        for (char ch : reversed.toCharArray()) {
            Digit currentDigit = convertorSingleChar(ch);
            result.plus(ExtendedOperations.multiply(currentDigit, position.getResult()));

            position.multiply(new ExtendedNumbers().ten());
        }

        return result.getResult();
    }

    private static Digit convertorSingleChar(char ch){
        Numbers numbers = new Numbers();

        switch (ch){
            case '0':
                return numbers.zero();
            case '1':
                return numbers.one();
            case '2':
                return numbers.two();
            case '3':
                return numbers.three();
            case '4':
                return numbers.four();
            case '5':
                return numbers.five();
            case '6':
                return numbers.six();
            case '7':
                return numbers.seven();
            case '8':
                return numbers.eight();
            case '9':
                return numbers.nine();
            default:
                throw new UnsupportedOperationException("Unable to find digit for " + ch);
        }
    }

}
