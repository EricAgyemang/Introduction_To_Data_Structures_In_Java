package edu.ilstu;

import java.util.Random;

/*
This is a 2D program array M of nbRows x nbCols of random integers between 0 and 9
where nbRows and nbCols are two constant set to 5. TwoDArray is a class of 2 dimentional array that 
compute the sum of rows and the sum of columns
*/
public class TwoDArray {
    public static void main(String[] args) {

        //The rows and column numbers are innitialized
        int nbRows = 5;
        int nbCols = 5;
    //The array M object is declared here
        int[][] M = new int[nbRows][nbCols];

    //Declaring the random number generation object
        Random random = new Random();

    //Using a nested for loop to assign random numbers to the array as its elements
        for(int i=0;i<nbRows;i++){
            for(int j=0; j<nbCols; j++){
                M[i][j] = random.nextInt(10);
            }
        }
    //Initializing the total sum of rows and columns
      int totalSum = 0;
      for(int i=0; i<nbRows;i++){
          int rowSum = 0;
          for(int j=0; j<nbCols;j++){
              System.out.print("\t "+ M[i][j]); //printing out the output of the matrix

              rowSum +=M[i][j]; //Finding the row sum of the matrix
          }
          //printing out the the output of the row sum
          System.out.println(" |\t "+ rowSum);
          System.out.println();

          //finfing the total sum of all elements of the matrix M
          totalSum += rowSum;
      }

      System.out.println("\t-------------------------------------------\n"); //This line separates the column sum elements from the last row elements
      for(int j=0; j<nbCols;j++){ //The for loop to find the column sum of the matrix M
          //Initializing the column sum
        int colSum = 0;
        //For loop to find the column sum
          for(int i = 0; i<nbRows; i++){
              colSum+=M[i][j];
          }
          System.out.print("\t "+ colSum); //Output of the column sum
      }
      System.out.print("|\t "+ totalSum);//Output for the total sum


       //3 Extra credit points.

      //Note: There is a mistake in the document. The mistake is in the sample output provided under the total value of 85 provided.
      //The correct value should be 92. I think the code writing to compute the over all total of the rows and columns totals had some flows.
    }
}
