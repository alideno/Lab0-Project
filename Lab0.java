/** This is a method implementing the first requirement of the fist lab 
 * 
 * @author Rasul Ibrahimzade    
 * 07.02.2023   12:06
 * 
 * @edits Deniz Şahin
 */

import java.util.Random;
import java.util.Scanner;

class Lab0
{
    public static int[] randomArray() 
    {
        // 1.Given an array size, create an int array that contains random integers in the range [0,100]. All the remaining functionality will operate on this array.
        // Takes a value from a user to determine the size of the array. Then, creates an array with random numbers in it for the range of [1 , 100]. 

        // How many numbers will there be in the array
        System.out.print("Please input the size of an array: ");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] numbers = new int [arraySize];

        // Randomizer for each number of the array
        Random random = new Random();

        for ( int i = 0; i < arraySize; i++ )
        {
            int randomNumber = random.nextInt(101)  ;
            // System.out.println(randomNumber); // Control purposes
            numbers[i] = randomNumber;
        }
        System.out.println(average.ArrayString(numbers));
        return numbers;
    }
        public static void main(String[] args) {
            String choice;
            int[] numbers = randomArray();
            do
            {
    
                System.out.println("\nPlease choose one of the options below:\n1. Find the minimum and the maximum of the array\n" 
                               + "2.Find the average of the array. Display how each element of the array differs from the average\n"
                               + "3.Find the sum of elements with odd- and even-numbered indexes\n"
                               + "4.Exit\n");
    
                System.out.print("Choose an option: ");
                Scanner input = new Scanner(System.in);
                choice = input.nextLine();
    
                if ( choice.equals("1"))
                {
                    System.out.println("\n1.Find the minimum of the array\n2.Find the maximum of the array");
                    input = new Scanner(System.in);
                    choice = input.nextLine();
    
                    if ( choice.equals("1" ))
                    {
                        System.out.println("The minimum of the array is " + third.minValue(numbers));
                    }
                    else if ( choice.equals("2"))
                    {
                        System.out.println("The maximum of the array is " + third.maxValue(numbers));
                    }
    
    
                }
    
                else if ( choice.equals("2"))
                {
                    System.out.println("\n1.Find the average of the array\n2.Display how each element of the array differs from the average");
                    input = new Scanner(System.in);
                    choice = input.nextLine();
                    if (choice.equals("1"))
                    {
                         System.out.println("Average of the array is " + average.getAverage(numbers));
                    }
                    else if (choice.equals("2"))
                    {
                        System.out.println("Difference of each element relative to the average: " + average.ArrayString(average.getDifferance(numbers)));
                    }
                }
                else if ( choice.equals("3"))
                {
                        System.out.println("The sum of elements with even-numbered indexes are " + question5.groupAddNumbers(numbers)[0] 
                                        + ". The sum of elements with odd-numbered indexes are " + question5.groupAddNumbers(numbers)[1]);
                }
            }
            
            while ( !(choice.equals("4")));   
    
            System.out.println("\nThe end of the program");
    
    
    
            
        
        }

}
