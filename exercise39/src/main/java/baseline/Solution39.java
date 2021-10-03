/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marcelino Pozo
 */
/*
    PSUEDOCODE
    -This program will ran from the main method and use helper methods throughout
    -First there will be a class called employee which will have the fields:
        -Firstname
        -Lastname
        -Position
        -Seperation Date
        -There will be getter methods for all of these fields as well as a constructor that sets them up
    -Then the method createEmployees will create all 6 employee objects and put them in a map
    -This map will then be sent to a function that will sort and print the employees by last name in a tabular format



 */

package baseline;

import java.util.HashMap;
import java.util.Map;

public class Solution39 {
    //Main method, will call createEmployees
    public static void main(String[] args) {
        sortEmployees(createEmployees());
    }

    //Will create all employees objects and place them in the map, data is hardcoded
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

    //Will sort employees by looking at the first character of their last name, will then display the sorted map
    private  static void sortEmployees(Map<Integer,Employee> employeeMap)
    {
        Employee temp;

        //This for loop checks the first letter of each last name and compares it to the first letter under it
        //If the letter of the ith lastname is > the i+1th lastname the 2 are swapped
        //If the first letter is equal the program then uses a second for loop to compare all letters
        for (int i = 1; i < 6; i++)
        {
            if(employeeMap.get(i).getLastName().charAt(0) > employeeMap.get(i+1).getLastName().charAt(0))
            {
                temp = employeeMap.get(i);
                employeeMap.replace(i,employeeMap.get(i+1));
                employeeMap.replace(i+1,temp);
                i=0;

            }
            else if(employeeMap.get(i).getLastName().charAt(0) == employeeMap.get(i+1).getLastName().charAt(0))
            {
                int nameLen;

                if(employeeMap.get(i).getLastName().length() <= employeeMap.get(i+1).getLastName().length())
                    nameLen = employeeMap.get(i).getLastName().length();
                else
                    nameLen = employeeMap.get(i+1).getLastName().length();


                for (int j = 1; j < nameLen ; j++) {
                    if(employeeMap.get(i).getLastName().charAt(j) > employeeMap.get(i+1).getLastName().charAt(j))
                    {
                        temp = employeeMap.get(i);
                        employeeMap.replace(i,employeeMap.get(i+1));
                        employeeMap.replace(i+1,temp);

                        break;
                    }
                }
            }
        }


        //This block prints out the final sorted map
        System.out.println("Name                  | Position            | Separation Date");
        System.out.println("----------------------|---------------------|------------------");
        for (int i = 1; i <=6 ; i++)
        {
            temp = employeeMap.get(i);
            System.out.printf("%-10s %-10s |",temp.getFirstName(),temp.getLastName());
            System.out.printf(" %s \t %s\n",temp.getPosition(),temp.getSeperationDate());

        }

    }

}
