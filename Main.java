import java.util.Arrays;
public class Main {

  public static int[][] copySquare(int[][] input) {

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

  public static int[][] copyRagged(int[][] input) {

    int[][] output = new int[][];
    for (int[] row : input) {
      for (int num : row) {
        
        output[row][num] = input[row][num]; 
      }
    }
    return output;
  }
  
  public static void main(String[] args) {
    //int[][] origSquareArr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //int[][] newSquareArr = copySquare(squareArr);
    //System.out.println(Arrays.deepToString(newSquareArr));

    //int[][] origRectArr = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
    //int[][] newRectArr = copyRectangle(origRectArr);
    //System.out.println(Arrays.deepToString(newRectArr));

    int[][] origRagArr = new int[][] {{1, 2, 3}, {4, 5, 6, 7}, {8, 9}};
    int[][] newRagArr = copyRagged(origRagArr);
    System.out.println(Arrays.deepToString(newRagArr));
  }
}