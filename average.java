public class average {

    public static int getAverage(int[] numbers){
        int total = 0;
        for (int i : numbers) {
            total += numbers[i-1];
        }
        return total/numbers.length;
    }

    public static int[] getDifferance(int[] numbers){
        int avg = getAverage(numbers);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = avg - numbers[i];
        }
        return numbers;

    }
    
    public static String ArrayString(int[] numbers){
        String output = "{";
        for (int i = 0; i < numbers.length-1; i++) {
            String a = numbers[i]+",";
            output += a;
        }
        output += numbers[numbers.length-1]+"}";
        return output;
    }

}
