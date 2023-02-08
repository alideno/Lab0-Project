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
    public int minValue(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    } 
    public static void main(String[] args) {
        third za = new third();
        int[] a = {1,2,56,5,4,8,4,1,9,8,8,964,54,647};
        System.out.println(maxValue(a));
        System.out.println(za.maxValue(a));
    }
}