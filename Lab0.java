/** This is a method implementing the first requirement of the fist lab 
 * 
 * @author Rasul Ibrahimzade    
 * 07.02.2023   12:06
 * 
 * @edits Deniz Şahin
 */

import java.util.Arrays;
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
            int randomNumber = random.nextInt(101);
            // System.out.println(randomNumber); // Control purposes
            numbers[i] = randomNumber;
        }

        return numbers;
        // System.out.println( Arrays.toString(numbers)); // Control purposes


        
    }
}
