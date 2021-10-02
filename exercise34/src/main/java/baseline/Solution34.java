/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create an input method, this method will use a scanner to take in input.
    -Create a string array full of 5 employee names
    -Display all the names
    -Ask the user for a name to remove
    -Since the array of names is an arrayList we can remove the name when we encounter it in the list
    -Finally we can display the updated list

 */
package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    //Driver function, will run input().
    public static void main(String[] args) {
        input();
    }

    //Creates an array of strings and removes a specified value from that array.
    private static void input()
    {
        //This function uses a for loop to remove the chosen value
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        String input;

        System.out.println("There are "+names.size()+" employees:");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(names.get(i));
        }

        System.out.println("Enter an employee name to remove:");
        input = in.nextLine();

        for(int i = 0; i < 5; i++)
        {
            if(names.get(i).equals(input))
            {
                names.remove(i);
                break;
            }
        }

        System.out.println("There are "+names.size()+" employees:");
        for(int i = 0; i <names.size(); i++)
        {
            System.out.println(names.get(i));

        }

    }

}
