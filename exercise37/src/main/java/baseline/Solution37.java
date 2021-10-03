/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -Use a method called input to take in user input
        -Prompt for minimum length
        -Prompt for how many special characters
        -Prompt for how many numbers
    -Use a method called generatePass to generate and return the password string
        -This method will use a for loop and the Rand class
        -It will take in the all the data the user entered and will be called from inside input
    -Finally display the password in input

 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution37 {
    //Driver method, calls input
    public static void main(String[] args) {
        input();
    }

    //Takes in user input with a scanner, calls generatePass
    private static void input()
    {
        Scanner in = new Scanner(System.in);
        int length;
        int special;
        int numbers;

        //These 3 println's prompt for user input
        System.out.println("What's the minimum length?");
        length = Integer.parseInt(in.nextLine());

        System.out.println("How many special characters?");
        special = Integer.parseInt(in.nextLine());

        System.out.println("How many numbers?");
        numbers = Integer.parseInt(in.nextLine());


        System.out.println("Your password is "+generatePass(length,special,numbers));


    }

    //Generates the password using the rand class
    private static String generatePass(int length, int special,int numbers)
    {
        //Character lists
        char[] specialCharacterList = {'!','@','#','$','%','^','&','*','?','>','<','.','=','+'};
        char[] letterList = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] numberList = {'0','1','2','3','4','5','6','7','8','9'};

        String password = "";
        Random rand = new Random();
        int randNumber;

        //Adds in the letters first
        for(int i = 0; i < length - (special+numbers);i++)
        {
            randNumber = rand.nextInt(27);
            password = password + letterList[randNumber];
        }

        //Then the special characters are added
        for (int i = 0; i < special;i++)
        {
            randNumber = rand.nextInt(specialCharacterList.length);

            password = password + specialCharacterList[randNumber];

        }

        //Finally the numbers are added
        for (int i = 0; i < numbers;i++)
        {
            randNumber = rand.nextInt(numberList.length);

            password = password + numberList[randNumber];

        }


        return password;
    }

}
