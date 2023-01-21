import java.util.*;

public class Pattern7 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    for (int rows = 1; rows <= n; rows++) {
      for (int s = 2 ; s <= rows; s++) {
        System.out.print("\t");
      }
      System.out.print("*\t");
      System.out.println();
    }
  }
}
