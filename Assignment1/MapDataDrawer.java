package Assignment1;

import java.util.*;
import java.io.*;
import java.awt.*;

public class MapDataDrawer
{

  private int[][] grid;

  public MapDataDrawer(String filename, int rows, int cols){
      // initialize grid 
      grid = new int[rows][cols];
      
      //read the data from the file into the grid
      File dataFile = new File(filename);
      try {
         Scanner dataInput = new Scanner(dataFile);
         for (int i=0; i<rows; i++) {
            for (int j=0; j<cols;j++) {
               grid[i][j] = dataInput.nextInt();
            
            }
         }
         
      } catch (Exception e) { e.printStackTrace();}

  }
  
  /**
   * @return the min value in the entire grid
   */
  public int findMin() {               //Iterate through the main array, then the interior array each time, checking if each number is the lowest
   int minnumber = grid[0][0];
   for(int i=0; i<grid.length; i++){   //Main array iteration
      for (int j=0; j<grid[i].length; j++){     //Interior array iteration
         if (grid[i][j]  < minnumber){    //Checks if the new number is lower
            minnumber = grid[i][j];
         }
      }
   }

   return minnumber;
     // Implement this method in Programming Assignment 1
    //Cycle through the entire array and keep track of the lowest value

  }

  /**
   * @return the max value in the entire grid
   */
  public int findMax(){          //Iterate through the main array, then the interior array each time, checking if each number is the highest
   int maxnumber = grid[0][0];
   for(int i=0; i<grid.length; i++){      //Main array iteration
      for (int j=0; j<grid[i].length; j++){     //Interior array iteration
         if (grid[i][j] > maxnumber){     //Checks if the new number is lower
            maxnumber = grid[i][j];
         }
      }
   }

   return maxnumber;
     // Implement this method in Programming Assignment 1

  }
  
  /**
   * @param col the column of the grid to check
   * @return the index of the row with the lowest value in the given col for the grid
   */
  public  int indexOfMinRow(int col){     //Loop through each row while checking the column value to find the index of the row with the lowest value in that column
   int rownum = 0;
   int min = grid[0][0];
   for (int i=0; i<grid.length; i++){  //Iterate through the rows
      if (grid[i][col] < min){      //Checks if the current row contains the lowest column number
         min = grid[i][col];
         rownum = i;
      }
   }

   return rownum;
   //Implement this method in Programming Assignment 1
  
  }
  
  /**
   * Draws the grid using the given Graphics object.
   * Colors should be grayscale values 0-255, scaled based on min/max values in grid
   */
  public void drawMap(Graphics g){
      int min = findMin();
      int max = findMax();
      
      for (int i=0; i<480; i++) {
         for (int j=0; j<480; j++) {
            int c = (255 * (grid[i][j] - min)) / (max - min);
            g.setColor(new Color(c, c, c));
            g.fillRect(j, i, 1, 1);
         }
      }
   }

   /**
   * Find a path from West-to-East starting at given row.
   * Choose a foward step out of 3 possible forward locations, using greedy method described in assignment.
   * @return the total change in elevation traveled from West-to-East
   */
  public int drawLowestElevPath(Graphics g, int row){
   int elevChange = 0;
   int currentrow = 0;
   //find the lowest value in column 0
   int minnumber = grid[0][0];
   for(int i=0; i<grid.length; i++){
      if (grid[i][0] > minnumber){     //Checks if the new number is lower
         minnumber = grid[i][0];
         currentrow = i;
      }
   }
   //create loop to go through column 1-480
   //run the greedy algorithim for each column
   //grid[row][column]
   //a is top - grid[row-1][column+1]
   //b is middle - grid[row][column+1]
   //c is bottom - grid[row+1][column+1]
   
   //int top = grid[currentrow - 1][1];  //Start -1 row and +1 column
   //int mid = grid[currentrow][1];      //Start current row and +1 column
   //int bottom = grid[currentrow + 1][1]; //Start +1 row and +1 column
   for (int i = 1; i<480; i++){
      //take current elevation and compare it to each possible option
      //run elevation changes through minOfThree function
      int currentpoint = grid[currentrow][i-1]; //current 
      int option1 = grid[currentrow-1][i];      //top
      int option2 = grid[currentrow][i];        //mid
      int option3 = grid[currentrow+1][i];      //bottom
      int result = minOfThree((Math.abs(currentpoint-option1)), Math.abs(currentpoint-option2), Math.abs(currentpoint-option3));
      //result is the smallest elevation change

      //update total elevation change
      elevChange = elevChange + result;

      if (result == option1){  //Changes the row value accordinly
         currentrow = currentrow-1; 
      } else if (result == option3){
         currentrow = currentrow+1;
      }
   }
    
      // Implement this method in Programming Assignment 2
      return elevChange;
          
  }

   private int minOfThree(int a, int b, int c) {
      if ((a < b) && (a < c)) return a;
      if ((b < a) && (b < c)) return b;
      if ((c < a) && (c < b)) return c;
      return 0;
   }
  
}
