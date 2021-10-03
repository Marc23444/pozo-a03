/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a function called input to take in user input
        -The user will enter names in a while loop until the give a blank answer
        -The names will be placed in an arraylist
    -A random number will then be generated using a function called generateWinner
        -Generate winner will take in the lists size and generate a number from 0 to n
    -The name related to this number will then be displayed by the input function

 */
package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    //Driver function, will call input()
    public static void main(String[] args) {
        input();
    }

    //Will take in user input, call generateWinner and display the winner
    private static void input()
    {
        //A scanner, arraylist and while loop will be used
        Scanner in = new Scanner(System.in);
        String inputStr = "default";
        ArrayList<String> names = new ArrayList<String>();

        //This loop runs until the user enters nothing
        while(!inputStr.equals(""))
        {
            System.out.println("Enter a name:");
            inputStr = in.nextLine();
            if(!inputStr.equals(""))
            {
                names.add(inputStr);
            }
        }

        //Output
        System.out.println("The winner is... "+ names.get(generateWinner(names.size())));

    }

    //Will use the Rand class to generate a random number for 0 to size
    private static int generateWinner(int size)
    {
        Random rand = new Random();

        return rand.nextInt(size);
    }
}
