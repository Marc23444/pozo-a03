/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a function called input that will use a scanner to take in numbers until the user enters done.
        -These numbers will be placed in an array list
        -A while loop will be used to take in input
        -All bad input will be ignored using a try catch statement
    -This list will be sent to a function called output
    -Output will call 4 functions, average, max, min and std
    -These 4 functions will have a double return type and the returned value will be displayed in output

 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    //Main driver function, will call input
    public static void main(String[] args) {
        input();
    }

    //Uses a while loop and scanner to take in input, stores input in an arrayList
    private static void input()
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numList = new ArrayList<Double>();
        String inputStr = "default";

        while(!inputStr.equals("done"))
        {
            System.out.println("Enter a number:");
            inputStr = in.nextLine();

            try{
                if(!inputStr.equals("done"))
                {
                    numList.add(Double.parseDouble(inputStr));
                }
            }
            catch (Exception e)
            {
                System.out.println("Please enter a valid input");
            }
        }

        output(numList);


    }

    //Takes in an arrayList from input, will call for and display average, max, min and std
    private static void output(ArrayList<Double> numList)
    {
        System.out.print("Numbers: ");
        for(int i = 0; i < numList.size();i++)
        {
            System.out.print(numList.get(i)+", ");
        }

        System.out.println("\nThe average is "+average(numList));

        System.out.println("The minimum is "+min(numList));

        System.out.println("The maximum is "+max(numList));

        System.out.printf("The standard deviation is %.2f",std(numList));
    }

    //Calculates and returns the average value of the list
    private static double average(ArrayList<Double> numList)
    {
        double temp = 0;

        for(double num : numList)
        {
            temp+=num;
        }

        return (temp / numList.size());
    }


    //Calculates and returns the min value in the list
    private static double min(ArrayList<Double> numList)
    {
        double min = numList.get(0);
        for(double num : numList)
        {
            if(num < min)
            {
                min = num;
            }
        }

        return min;
    }


    //Calculates and returns the max value in the list
    private static double max(ArrayList<Double> numList)
    {
        double max = 0;

        for(double num : numList)
        {
            if(num > max)
            {
                max = num;
            }
        }

        return max;
    }

    //Calculates and returns the standard deviation
    private static double std(ArrayList<Double> numList)
    {
        double mean = average(numList);
        double std = 0.0;

        for(int i = 0; i < numList.size();i++)
        {
            std = std + Math.pow((numList.get(i)-mean),2);
        }

        std = std / numList.size();

        std = Math.sqrt(std);


        return std;
    }


}
