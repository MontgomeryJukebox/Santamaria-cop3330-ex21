import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        String months[] = {
                "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December"
        };
        */

        // this is awful
        String month = "";
        System.out.print("Please enter the number of the month:");
        int index = in.nextInt();
        switch (index) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }

        System.out.printf("The name of the month is %s\n", month);
        in.close();
    }
}
