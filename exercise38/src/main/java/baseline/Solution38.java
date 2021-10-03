/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input function that uses a scanner to handle input
        -Take in input as a single space separated string
        -Convert that string to an int arrayList
    -Pass that arrayList through a function called filterEvenNumbers
        -This function will use a for loop and modulus operator to determine the even and odd numbers
        -This function will remove any odd numbers and return the filtered arrayList
    -The filtered list is printed in input

 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
    //Driver function, calls input
    public static void main(String[] args) {
        input();
    }

    //This function will use a scanner to take in the space separated input
    //It will then convert that input into an ArrayList of integers
    private static void input()
    {
        //filterEvenNumbers will be called here
        Scanner in = new Scanner(System.in);
        String inputStr;
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Enter a list of numbers, separated by spaces:");
        inputStr = in.nextLine();



        for (int i = 0; i < inputStr.length(); i++)
        {
            if(inputStr.charAt(i) != ' ')
            {

                numList.add(Integer.parseInt(String.valueOf(inputStr.charAt(i))));

            }
        }

        numList = filterEvenNumbers(numList);

        System.out.print("The even numbers are");

        //Prints out the filtered list
        for (Integer integer : numList) {
            System.out.print(" " + integer);
        }

    }

    //Will use a for loop and a modulus operator to remove any odd numbers from the list
    private static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numList)
    {
        ArrayList<Integer> evenList = new ArrayList<>();

        //Checks every element in the list and adds to evenList when an element is even
        for (Integer integer : numList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }


        return evenList;
    }

}
