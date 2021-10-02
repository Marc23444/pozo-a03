/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -The program starts with a function called difficultyInput
    -Once this function has gotten valid input, it will pass the difficulty level chosen to the function gameLoop
    -Gameloop
        -Will generate a random number based on the difficulty level
        -Will have a while loop that prompts the user for input
        -Will check if the user is right or wrong, will keep track of total guesses
            -The program will provide feedback based on a users preformance
                -If the number guessed was too high the user is told
                -If  the number guessed was too low the user is also told
            -Once the correct number is found the loop will exit
        -Once out of the loop the program will ask the user to play again, this will result in a call to difficultyInput
        and the cycle will continue

 */
package baseline;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

public class Solution32 {

    //Driver function, runs difficultyInput
    public static void main(String[] args) {
        difficultyInput();
    }

    //Takes in and validates a difficulty setting from the user
    private static void difficultyInput()
    {
        //Uses a while with a try catch inside
        Scanner in = new Scanner(System.in);
        boolean validInput = false;
        int difficulty = 0;


        System.out.println("Let's play Guess the Number!");

        while (!validInput)
        {

            try{
                System.out.println("Enter the difficulty level (1, 2, or 3):");
                difficulty = Integer.parseInt(in.nextLine());

                if(difficulty == 1 ||difficulty == 2 ||difficulty == 3)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("Invalid input.");
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid input.");
            }
        }

        gameLoop(difficulty);


    }

    //This function contains the bulk of the function and is the brains behind the game
    private static void gameLoop(int difficulty)
    {
        //Uses a while loop and a random number generator

        int secretNum, guess, guessCount = 1;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;

        //This switch determines the max number the secret number can be.
        switch (difficulty)
        {
            case 1:
                secretNum = rand.nextInt(10);
                break;
            case 2:
                secretNum = rand.nextInt(100);
                break;
            case 3:
                secretNum = rand.nextInt(1000);
                break;
            default:
                secretNum = 0;
                break;
        }
        //GAME STARTS HERE
        //These try catch statements make sure the user enters valid input.
        System.out.println("I have my number. What's your guess?");
        try {
            guess = Integer.parseInt(in.nextLine());
        }
        catch (Exception e)
        {
            System.out.println("Invalid input, this will be counted as a guess.");
            guess = 0;
        }


        //While loop that runs while the guess is wrong
        //Try catches are used to make sure the input is valid
        while (guess != secretNum)
        {
            //This if else blocks provides the user with feedback
            if(guess < secretNum)
            {
                System.out.println("Too low. Guess again:");
            }
            else if (guess > secretNum)
            {
                System.out.println("Too high. Guess again:");
            }

            try {
                guess = Integer.parseInt(in.nextLine());
            }
            catch (Exception e)
            {
                System.out.println("Invalid input, this will be counted as a guess.");
            }

            guessCount++;

        }

        //Finally the program tells the user the amount of guesses it took and prompts them to play again.
        System.out.println("You got it in "+guessCount+" guesses!\n");
        System.out.println("Do you wish to play again (Y/N)?");
        playAgain = in.nextLine();

        if(playAgain.equals("y")||playAgain.equals("Y"))
        {
            difficultyInput();
        }

    }

}
