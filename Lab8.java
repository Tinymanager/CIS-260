import java.util.Scanner;

public class Lab8 {

   /* DO NOT CHANGE THE MAIN METHOD */

   public static void main(String[] args) {

      // numbers is an array of ints of size 10
      int[] numbers = new int[10];
      
      Scanner input = new Scanner(System.in);
      
      // Generate random numbers between 1 and 20 and 
      // fill up the array
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int) (Math.random() * 19 + 1);
      }
      
      System.out.println("The list is:");
      printNumbers(numbers);
            
      System.out.println("The list in sorted order is:");
      printNumbers(sortedNumbers(numbers));
         
   }
   
   /*
   DO NOT CHANGE ANY CODE IN THIS METHOD.

   The following method prints out all the numbers in an 
   int array. The int array is passed in as parameter. There
   is no return value.
   */
   public static void printNumbers(int[] list) {
      for (int i = 0; (i < list.length) && (list[i] != 0); i++) {
         System.out.print(list[i] + " ");
      }
      System.out.println();
   }
   
   /* Task 2: Complete this method. I've already 
      created a structure for the method, and have 
      included comments for the algorithm. Your job is 
      to simply fill in the code. Each comment will be 
      replaced by a *single* line of code, in the same
      order in which the comments appear. 
   */
   public static int[] sortedNumbers(int[] inArray) {
      int[] outArray = new int[inArray.length];
      int n;
      int s;
      int pos = 0;
      for (int i = 0; i < inArray.length; i++) {
        s = smallestNumber(inArray);
        n = firstIndexOf(inArray, s);
        removeNumberAt(inArray, n);
        outArray[pos] = s;
        pos++;
        }

         // find the smallest number in inArray

         
         // add s to outArray at the next open location. 
         // It is your job to figure out what that location
         // should be. Hint: Use the loop control variable
         // of this loop you are in. 

                           
         // find the index of the first occurrence of 
         // s in inArray. Hint: Use the firstIndexOf method
         // fill in the rest

         // remove the smallest number from inArray
         // from position pos. Hint: Use the removeNumberAt method

      return outArray;
   }
   
   /*
   DO NOT CHANGE THE CODE IN THIS METHOD.
   
   The following method takes two parameters -- an int array (list)
   and a single int (target). The method returns true if the number
   target is present in the array list, and false otherwise. 
   */
   public static boolean isPresent(int[] list, int target) {
      for (int i = 0; i < list.length; i++) {
         if (list[i] == target) {
            return true;
         }
      }
      return false;
   }
   
   /* Task 1: Complete the following method. 
      This method is very similar to isPresent, except that 
      this one returns the first index at which the number
      target appears in the array list. If the number is not
      present, then it returns -1.
   */
   public static int firstIndexOf(int[] list, int target) {
    for (int i = 0; i < list.length; i++) {
        if (list[i] == target) {
           return i;
        }
     }
     return -1;
   }
   
   /* 
   DO NOT CHANGE THE CODE IN THIS METHOD.
   
   This method takes two parameters -- an array, and a 
      position, and removes the number at the given position. 
   */
   public static void removeNumberAt(int[] list, int pos) {
      for  (int i = pos; i < list.length - 1; i++) {
         list[i] = list[i + 1];
      }
      list[list.length - 1] = 0; 
   }
  
   /* 
   DO NOT CHANGE THE CODE IN THIS METHOD.
   
   This method takes an int array as parameter, 
   and returns the smallest number.
   */
   public static int smallestNumber(int[] list) {
      int small = list[0];
      for (int i = 1; i < list.length; i++) {
         if ((list[i] < small) && (list[i] != 0)) {
            small = list[i];
         }
      }
      return small;
   }
}