package EPTPractice4;

public class EPTfind {
    // EVen Number
    public static void printEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
    
    //Odd Number
    
    public static void printOddNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
    
    // find the sum of each array
    
    public static int findMaxSum(int[] numbers) {
        int maxSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("The highest sum is: " + maxSum);
        return maxSum;
    }
}

