import java.util.*;

public class Pattern11 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int x = 1;
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= rows; col++) {
        System.out.print(x++ +"\t");
      }
      System.out.println();
    }
  }
}
