package Tasks.UltimateGoal;

import Numbers.Digit;
import Tasks.Task2.ExtendedOperations;
import java.util.Scanner;

/**
 * Calculator that counts only via Digits
 * (Should be runnable after Task 4)
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("WARNING: If a result would be more than 10000 this program will probably crash (OutOfMemoryError)");
        Digit firstNumber = getNumber();
        String operation = getOperation();
        Digit secondNumber = getNumber();

        SignedDigit result = countResult(firstNumber, operation, secondNumber);

        System.out.println("Result is:");

        if(!result.isPositive()){
            System.out.print("-");
        }

        System.out.println(result.getDigit().toString());
    }

    public static SignedDigit countResult(Digit firstNumber, String operator, Digit secondNumber){
        switch (operator){
            case "+": return new SignedDigit(ExtendedOperations.plus(firstNumber, secondNumber));
            case "-":
                if(secondNumber.isBigger(firstNumber)){
                    return new SignedDigit(false, ExtendedOperations.multiply(secondNumber, firstNumber));
                }else {
                    return new SignedDigit(ExtendedOperations.multiply(firstNumber, secondNumber));
                }
            case "*": return new SignedDigit(ExtendedOperations.multiply(firstNumber, secondNumber));
            default:
                throw new RuntimeException("Unexpected operator: " + operator);
        }
    }

    public static Digit getNumber(){
        Scanner scanner = new Scanner(System.in);

        String stringNumber = "";
        do {
            System.out.println("Enter number please:");
            stringNumber = scanner.next();

        }while (!stringNumber.matches("^[0-9]+$"));

        return Convertor.convertor(stringNumber);
    }

    public static String getOperation(){
        Scanner scanner = new Scanner(System.in);

        String stringOperation = "";
        do {
            System.out.println("Enter operation please (+,-,*):");
            stringOperation = scanner.next();

        }while (!stringOperation.matches("^[+\\-\\*]{1}$"));

        return stringOperation;
    }
}
