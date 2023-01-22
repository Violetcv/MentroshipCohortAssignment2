import java.util.*;

public class Pattern6 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // write ur code here
    int n = scn.nextInt();
    int s = 1;
    int x = (n / 2) + 1;
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= x; col++) {
        //stars
        System.out.print("*\t");
      }
      for (int col = 1; col <= s; col++) {
        //space
        System.out.print("\t");
      }
      for ( int col = 1; col <= x; col++) {
        //stars x2
        System.out.print("*\t");
      }

      if (rows <= n / 2) {
        x--;
        s += 2;

      } else {
        x++;
        s -= 2;
      }
      System.out.println();
    }
  }
}
