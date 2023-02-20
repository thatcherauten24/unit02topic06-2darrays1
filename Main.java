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

  
  public static void main(String[] args) {
    int[][] orig = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] newArr = copySquare(orig);

    System.out.println("do they live at the same memory address...? " + orig + ", and " + newArr);
    System.out.println("do they have the same contents?");
    System.out.println(Arrays.deepToString(orig));
    System.out.println(Arrays.deepToString(newArr));

  }
}