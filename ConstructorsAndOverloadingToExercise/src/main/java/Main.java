
import Task1.Person;
import Task2.Database;
import Task4.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

    /**
     * Gets user an option from 1-4 to show data from database
     * @param args
     */
    public static void main(String[] args){
        List<Person> defaultPeople = DatabaseFile.getPeople();

        // TODO resolve user choice

        System.out.println("\nThank you for your choice!");
    }


    private static void showInfo(){
        System.out.println("Enter number for your choice:");
        System.out.println("1 - to show every person in database");
        System.out.println("2 - to show every adult men or woman");
        System.out.println("3 - to show adult males");
        System.out.println("4 - to get female children");
    }

    private static int scanIntWithInfo(){
        Scanner scanner = new Scanner(System.in);

        String userInput;
        do{
            showInfo();
            userInput = scanner.next();
        }while (!userInput.matches("[1-4]"));

        return Integer.parseInt(userInput);
    }

}