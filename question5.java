/** This is a method for the fifth question of the first lab(the git tutorial)
 * 
 * @author Deniz Şahin
 */
public class question5 {

    /**
     * This method adds the even indexed numbers and odd indexed numbers
     * @param numbers array
     * @return array [evenIndexedSum, oddIndexedSum]
     */
    public static int[] groupAddNumbers(int[] numbers)
    {

        int[] sumOfNumbers = new int[2];

        for(int i = 0; i < numbers.length; i++)
        {
            sumOfNumbers[i % 2] += numbers[i];
        }

        return sumOfNumbers;
    }
}