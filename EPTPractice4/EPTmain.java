package EPTPractice4;
import java.util.Scanner;
public class EPTmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create the Arrays
        System.out.println("How many slots do you want in Array One?");
        int inputnum = input.nextInt();
        int[] arrayOne = new int[inputnum];
        //System.out.println("How many slots do you want in Array Two?");
        //inputnum = input.nextInt();
        int[] arrayTwo = new int[inputnum];

        //Insert array values
        for (int i=0; i<arrayOne.length; i++){
            System.out.println("Please input the value for slot " + i + " in Array One.");
            arrayOne[i] = input.nextInt();
        }
        for (int i=0; i<arrayTwo.length; i++){
            System.out.println("Please input the value for slot " + i + " in Array Two.");
            arrayTwo[i] = input.nextInt();
        }

        //Call other file arrays here
        EPTfind.printEvenNumbers(arrayOne);
        EPTfind.printEvenNumbers(arrayTwo);
        EPTfind.printOddNumbers(arrayOne);
        EPTfind.printOddNumbers(arrayTwo);
        EPTfind.findMaxSum(arrayOne);
        EPTfind.findMaxSum(arrayTwo);

        EPTsort.MinMaxSort(arrayOne);
        EPTsort.MinMaxSort(arrayTwo);
        EPTsort.arrayComparison(arrayOne, arrayTwo);


        ArrayOutput(arrayOne, arrayTwo);
        input.close();

    }

    public static void ArrayOutput(int[] a, int[]b){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        return;
    }
}
