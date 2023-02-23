import java.util.Arrays;
public class Main {

  public static int[][] copySquare(int[][] input) {
    // FIXME: don't hard code the dimensions... use the input to determine these

    int squareSize = 3;

    int[][] output = new int[squareSize][squareSize];
    for (int r = 0; r < squareSize; r++) {
      for (int c = 0; c < squareSize; c++) {
        output[r][c] = input[r][c];
      }
    }
    return output;
  }

  public static int[][] copyRectangle(int[][] input) {
    // FIXME: don't hard code the dimensions... use the input to determine these
    int rows = 4;
    int cols = 3;

    int[][] output = new int[rows][cols];
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < cols; c++) {
        output[r][c] = input[r][c];
      }
    }
    return output;
  }

  // good
  public static int[][] copyRagged(int[][] input) {

    int[][] output = new int[input.length][];
    for (int row = 0; row < input.length; row ++) {
      output[row] = new int[input[row].length];
      for ( int col = 0; col < input[row].length; col++) {
        output[row][col] = input[row][col];
      }
      
    }
    return output;
  }
  
  // good
  public static void printTranspose(double[][] input) {

    int origRows = input.length;
    int origCols = input[0].length;

    double[][] rotated = new double[origCols][origRows];

    for (int c = 0; c < origCols; c++) {
      for (int r = 0; r < origRows; r++) {
        rotated[c][r] = input[r][c];
      }
    }

    for (double[] row : rotated) {
      for (double value : row) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
    
  }

  // TODO: implement withWeightedAverage
  public static void main(String[] args) {
    //int[][] origSquareArr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //int[][] newSquareArr = copySquare(squareArr);
    //System.out.println(Arrays.deepToString(newSquareArr));

    //int[][] origRectArr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
    //int[][] newRectArr = copyRectangle(origRectArr);
    //System.out.println(Arrays.deepToString(newRectArr));

    // int[][] origRagArr = new int[][] {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
    // int[][] newRagArr = copyRagged(origRagArr);
    // System.out.println(Arrays.deepToString(newRagArr));

    double[][] beforeTransposition = new double[][] {
      {99, 85, 98},
      {98, 57, 79},
      {92, 77, 74},
      {94, 62, 81},
      {99, 94, 92},
      {80, 76.5, 67},
      {76, 58.5, 90.5},
      {92, 66, 91},
      {77, 70.5, 66.5},
      {89, 89.5, 81}
    };
    printTranspose(beforeTransposition);
  }
}