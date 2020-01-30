package ie.gmit.scannerpack;

import java.util.Scanner;

/**
 * ScanFlow
 */
public class IfElseBirthMonth {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the month you were born.");
        int birthmonth = userInput.nextInt();

        userInput.close();

        System.out.println("The number of the month you were born in is "+birthmonth);

        if (birthmonth == 1) {
            System.out.println("You were born in January");
        }

        else if (birthmonth == 2) {
            System.out.println("You were born in Febuary");
        }

       else if (birthmonth == 3) {
            System.out.println("You were born in March");
        }

        else if (birthmonth == 4) {
            System.out.println("You were born in April");
        }

        else if (birthmonth == 5) {
            System.out.println("You were born in May");
        }

        else if (birthmonth == 6) {
            System.out.println("You were born in June");
        }

        else if (birthmonth == 7) {
            System.out.println("You were born in July");
        }

        else if (birthmonth == 8) {
            System.out.println("You were born in August");
        }

        else if (birthmonth == 9) {
            System.out.println("You were born in September");
        }

        else if (birthmonth == 10) {
            System.out.println("You were born in October");
        }

        else if (birthmonth == 11) {
            System.out.println("You were born in November");
        }

        else if (birthmonth == 12) {
            System.out.println("You were born in December");
        }

        else {
            System.out.println("Invalid month number - Please enter a number between 1 and 12");
        }
        
    }
}