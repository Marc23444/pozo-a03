/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Create a function called output that will print out a multiplication
    table that displays 1-12 inclusive

 */
package baseline;

public class Solution30 {

    //Calls output
    public static void main(String[] args) {
        output();
    }

    //Will display the table evenly spaced
    private static void output()
    {
        //This function will use a nested for loop
        for(int i = 1; i <= 12;i++)
        {
            for(int j = 1; j <=12;j++)
            {
                System.out.printf("%15d",i*j);

            }
            System.out.print("\n");
        }

    }
}
