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
  public int findMin() {
     // Implement this method in Programming Assignment 1
    
  }

  /**
   * @return the max value in the entire grid
   */
  public int findMax(){
     // Implement this method in Programming Assignment 1

  }
  
  /**
   * @param col the column of the grid to check
   * @return the index of the row with the lowest value in the given col for the grid
   */
  public  int indexOfMinRow(int col){
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
