package ie.gmit.scannerpack;

import java.util.Scanner;

/**
 * SwitchBirthMonth
 */
public class SwitchBirthMonth {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the month you were born.");
        int birthmonth = userInput.nextInt();

        userInput.close();

        System.out.println("The number of the month you were born in is "+birthmonth);

        String month;

        switch (birthmonth) {
            case1: month = "January";
                break;
            case2: month = "February";
                break;
            case3: month = "March";
                break;
            case4: month = "April";
                break;
            case5: month = "May";
                break;
            case6: month = "June";
                break;
            case7: month = "July";
                break;
            case8: month = "August";
                break;
            case9: month = "September";
                break;
            case10: month = "October";
                break;
            case11: month = "November";
                break;
            case12: month = "December";
                break;
        }

        System.out.println("You were born in "+month);

    }

    
}