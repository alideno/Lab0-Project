/**
 * third
 */
public class third {
    public static int maxValue(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
    }
    public static int minValue(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    } 
   
}
