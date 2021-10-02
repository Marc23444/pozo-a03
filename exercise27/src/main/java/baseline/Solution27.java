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

public class Solution27 {

    //Driver function, runs input()
    public static void main(String[] args) {

    }

    //Will create a scanner that takes in user input
    public static void input()
    {
        //This function will call validateInput after all input is taken in


    }

    //Uses 6 functions to validate input
    public static void validateInput(String firstName, String lastName, int zip, String ID)
    {
        //If there are any issues with the input an error message will be output
    }

    //Checks that the first name exists
    public static boolean checkFirstName(String firstName)
    {

    }

    //Checks that the last name exists
    public static boolean checkLastName(String lastName)
    {

    }

    //Checks that the first name is greater than 2 characters
    public static boolean checkFirstNameLength(String firstName)
    {

    }

    //Checks that the last name is greater than 2 characters
    public static boolean checkLastNameLength(String lastName)
    {

    }

    //Checks that the ID is in the format AA-1234
    public static boolean checkID(String ID)
    {

    }

    //Checks that the zip is a number
    public static boolean checkZip(int zip)
    {

    }

}
