/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -First there will be a class called employee which will have the fields:
        -Firstname
        -Lastname
        -Position
        -Seperation Date
        -There will be getter methods for all of these fields as well as a constructor that sets them up
    -Then the method createEmployees will create all 6 employee objects and put them in a map
    -After the employees have been created input() will be called
        -The user will be prompted to enter a search string
    -The search string will then be compared to the first or last name in a function called findString
    -The output will then be printed inside of findString


 */
package baseline;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution40 {
    //Driver method
    public static void main(String[] args) {
        input();
    }

    //Takes in input using a scanner, will call findString
    private static void input()
    {
        Scanner in = new Scanner(System.in);
        String str;

        System.out.println("Enter a search string:");
        str = in.nextLine();

        findString(str,createEmployees());
    }

    //Creates 6 employee objects and inserts them in a map
    private static Map<Integer,Employee> createEmployees()
    {
        Map<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();

        //Creates 6 employees each with their own hardcoded data
        Employee employee1 = new Employee("John","Johnson","Manager","2016-12-31");
        Employee employee2 = new Employee("Tou","Xiong","Software Engineer","2016-10-05");
        Employee employee3 = new Employee("Michaela","Michaelson","District Manager","2015-12-19");
        Employee employee4 = new Employee("Jake","Jacobson","Programmer"," ");
        Employee employee5 = new Employee("Jacquelyn","Jackson","DBA"," ");
        Employee employee6 = new Employee("Sally","Webber","Web Developer","2015-12-18");

        //Puts the employees in a map
        employeeMap.put(1,employee1);
        employeeMap.put(2,employee2);
        employeeMap.put(3,employee3);
        employeeMap.put(4,employee4);
        employeeMap.put(5,employee5);
        employeeMap.put(6,employee6);

        return employeeMap;
    }

    //Checks through the first and last names to find the string
    private static void findString(String str, Map<Integer,Employee> employeeMap)
    {
        //Prints the header for the table
        System.out.println("\nResults:");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        //Iterates through all the employees and checks if they contain str
        for (int i = 1; i <=  6 ; i++)
        {
            if(employeeMap.get(i).getFirstName().contains(str) || employeeMap.get(i).getLastName().contains(str))
            {
                Employee temp = employeeMap.get(i);

                System.out.println(temp.getFirstName() + " "+temp.getLastName()+" | "+temp.getPosition()+" | "+ temp.getSeperationDate());
            }

        }



    }



}
