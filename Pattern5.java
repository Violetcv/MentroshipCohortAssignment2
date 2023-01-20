import java.util.*;

public class Pattern5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    for (int rows = 1; rows <= n; rows++) {
      for (int s = 1; s <= Math.abs((n + 1) / 2 - rows); s++)
        System.out.print("\t");
      for (int col = 1; col <= 2 * rows - 1 && col <= 2 * (n - rows) + 1; col++)
        System.out.print("*\t");
      System.out.println();
    }
  }
}
