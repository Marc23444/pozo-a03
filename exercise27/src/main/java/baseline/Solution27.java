/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input method that takes in all user input using a scanner
    -Prompt and grab all input
    -Pass input through a validateInput function
        -This function will invoke 6 validation functions
            -checkFirstName, first name must be filled in
            -checkLastName, last name must be filled in
            -checkFirstNameLength, checks the length of the first name
            -checkLastNameLength, checks the length of the last name
            -checkID, ID format must be AA-1234. So, two letters, a hyphen, and four numbers.
            -checkZIP, the zipcode must be a number
    -This function will then output error messages accordingly
 */
package baseline;

import java.util.Scanner;

public class Solution27 {

    //Driver function, runs input()
    public static void main(String[] args) {
        input();
    }

    //Will create a scanner that takes in user input
    public static void input()
    {
        //This function will call validateInput after all input is taken in
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        String ID;
        String zip;

        System.out.println("Enter the first name: ");
        firstName = in.nextLine();

        System.out.println("Enter the last name: ");
        lastName = in.nextLine();

        System.out.println("Enter the ZIP code: ");
        zip = in.nextLine();

        System.out.println("Enter the employee ID: ");
        ID = in.nextLine();

        //If the validateInput function finds 0 errors this message will be displayed.
        if (validateInput(firstName,lastName,zip,ID) == 0)
        {
            System.out.println("There were no errors found.");
        }

    }

    //Uses 6 functions to validate input
    public static int validateInput(String firstName, String lastName, String zip, String ID)
    {
        //If there are any issues with the input an error message will be output

        //Tracks errors encountered
        int errors = 0;

        if(!checkFirstNameLength(firstName))
        {
            System.out.println("The first name must be at least 2 characters long.");
            errors++;
        }

        if(!checkLastNameLength(lastName))
        {
            System.out.println("The last name must be at least 2 characters long.");
            errors++;
        }

        if(!checkLastName(lastName))
        {
            System.out.println("The last name must be filled in.");
            errors++;
        }

        if(!checkFirstName(firstName))
        {
            System.out.println("The first name must be filled in.");
            errors++;
        }

        if(!checkID(ID))
        {
            System.out.println("The employee ID must be in the format of AA-1234.");
            errors++;
        }

        if(!checkZip(zip))
        {
            System.out.println("The zipcode must be a 5 digit number.");
            errors++;
        }
        return errors;
    }

    //Checks that the first name exists
    public static boolean checkFirstName(String firstName)
    {
        return !firstName.isEmpty();
    }

    //Checks that the last name exists
    public static boolean checkLastName(String lastName)
    {
        return !lastName.isEmpty();
    }

    //Checks that the first name is greater than 2 characters
    public static boolean checkFirstNameLength(String firstName)
    {
        return firstName.length() > 2;
    }

    //Checks that the last name is greater than 2 characters
    public static boolean checkLastNameLength(String lastName)
    {
        return lastName.length() > 2;
    }

    //Checks that the ID is in the format AA-1234
    public static boolean checkID(String ID)
    {
        char[] idArray = ID.toCharArray();
        //Converts the string to a character array and goes through and checks all 8 chars
        if(ID.length() == 7)
        {
            if(Character.isLetter(idArray[0]) && Character.isLetter(idArray[1]))
            {
                if(idArray[2] == '-')
                {
                    for (int i = 3; i < 7 ;i++ )
                    {
                        if(!Character.isDigit(idArray[i]))
                        {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }

        return false;
    }

    //Checks that the zip is a number
    public static boolean checkZip(String zip)
    {
        try {
            double d = Double.parseDouble(zip);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
