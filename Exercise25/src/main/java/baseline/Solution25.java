/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Take in input using an input() function
        -This function is called from main
        -This function will prompt for and
        receive a string
    -Then inside of input pass the string into a function called passwordValidator
        -This will determine whether a string is
            -Very weak
            -Weak
            -Strong
            -Very Strong
        -Then it will return an integer
    -This integer will be used inside of input() to determine the output
 */
package baseline;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Solution25 {
    //Calls input
    public static void main(String[] args) {
        input();
    }

    //Takes in input and displays output
    private static void input() {
        //Creates a scanner
        Scanner in = new Scanner(System.in);

        String password;

        System.out.println("Enter a password:");
        password = in.nextLine();

        switch (passwordValidator(password))
        {
        case 1:
            System.out.println(password+" is a very weak password.");
            break;
        case 2:
            System.out.println(password+" is a  weak password.");
            break;
        case 3:
            System.out.println(password+" is a strong password.");
            break;
        case 4:
            System.out.println(password+" is a very strong password.");
            break;
        case 5:
            System.out.println(password+" is of unknown strength.");
            break;
        default:
            break;
        }




    }

    //Takes in a string and checks how strong it is, this function is essentially a manager

    private static int passwordValidator(String password)
    {
        //Fewer than 8 means the pass is weak
        if(password.length() < 8)
        {
            if(! password.matches(".*[^a-z].*") || !password.matches(".*[^A-Z].*"))
            {
                //Weak
                return 2;
            }
            else if (password.matches(".*\\d.*"))
            {
                //Very Weak;
                return 1;
            }
            else
            {
                return 5;
            }

        }
        //Greater means its at least strong
        else
        {
            if(password.matches(".*\\d.*"))
            {
                if(password.matches(".*[^a-z].*") || password.matches(".*[^A-Z].*"))
                {
                    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
                    Matcher m = p.matcher(password);
                    boolean b = m.find();
                    if(b)
                    {
                        //Very Strong password
                        return 4;
                    }
                    //Strong password
                    return 3;
                }
            }
            return 5;
        }
    }

}
