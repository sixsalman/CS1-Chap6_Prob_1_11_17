package Prob1;

/**
 *  Author: Salman
 *
 *  This program stores employee information in instances of employee class and then prints that information
 */
public class Prob1Main {

    /**
     Prob1.Prob1Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     @param args is not used
     */
    public static void main (String[] args){

        //sets employee information
        Employee one = new Employee("Susan Meyers", 47899, "Accounting",
                "Vice President");

        Employee two = new Employee("Mark Jones", 39119, "IT", "Programmer");

        Employee three = new Employee("Joy Rogers", 81774, "Manufacturing",
                "Engineer");

        System.out.println(one + "\n" + two + "\n" + three + "\n"); //prints stores employee information

    }

}
