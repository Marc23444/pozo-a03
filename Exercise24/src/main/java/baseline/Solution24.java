/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Prompt and take in user input in an input function.
        -2 input strings are needed
    -Pass those 2 input strings through a function called isAnagram
    -Display an output based on whether isAnagram returns true
 */
package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        input();
    }

    //This function creates a scanner and takes in input
    private static void input()
    {
        Scanner in = new Scanner(System.in);
        String a,b;

        //Prompt for 2 strings
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.println("Enter the first string:");
        a = in.nextLine();
        System.out.println("Enter the second string:");
        b = in.nextLine();

        //Pass through isAnagram

        if(isAnagram(a,b))
        {
            System.out.println("\""+a+"\" and \""+b+"\" are anagrams.");
        }
        else
        {
            System.out.println("\""+a+"\" and \""+b+"\" are not anagrams.");
        }



    }

    //This function compares 2 strings to check if they are anagrams
    private static boolean isAnagram(String a, String b)
    {
        //First we will reverse string a and check if string a is
        //equal to string b

        char[] tempA = a.toCharArray();
        char[] tempB = b.toCharArray();

        if(a.length() != b.length())
        {
            return false;
        }

        Arrays.sort(tempA);
        Arrays.sort(tempB);

        for(int i = 0; i < a.length(); i++)
        {
            if (tempA[i] != tempB[i])
            {
                return false;
            }
        }

        return true;

    }
}
