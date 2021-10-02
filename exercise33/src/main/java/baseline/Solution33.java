/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input function to handle all user input
    -Create a string array the values should be:
        -Yes
        -No
        -Maybe
        -Ask again later
    -Use a random number from 0 to 3 to determine which value to display
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    //Driver method, runs input
    public static void main(String[] args) {
        input();
    }

    //This function will take in a question, create a list of answers and then choose an answer using a random number.
    private static void input()
    {
        //RNG = Random Number Generator
        Scanner in = new Scanner(System.in);
        int randNum;
        String[] answers = {"Yes.","No.","Maybe.","Ask again later."};
        Random RNG = new Random();

        randNum = RNG.nextInt(4);

        System.out.println("What's your question?");
        in.nextLine();

        System.out.println(answers[randNum]);


    }

}
