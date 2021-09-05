package hu.zza.replit;

public class CornersOfAnArray {
  public static void main(String[] args) {
    int[][] array =
        new int[][] {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
        };

    printCorners(array);
  }

  public static void printCorners(int[][] twoDimArray) {
    if (0 < twoDimArray.length && 0 < twoDimArray[0].length) {

      int lastX = twoDimArray[0].length - 1;
      int lastY = twoDimArray.length - 1;

      System.out.printf(
          "%d %d%n%d %d",
          twoDimArray[0][0],
          twoDimArray[0][lastX],
          twoDimArray[lastY][0],
          twoDimArray[lastY][lastX]);
    }
  }
}
