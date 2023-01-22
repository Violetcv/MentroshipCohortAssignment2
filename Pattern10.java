import java.util.*;

public class Pattern10 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int s1 = n / 2;
    int s2 = -1;
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= s1; col++) {
        System.out.print("\t");
      }
      System.out.print("*\t");
      for (int col = 1; col <= s2; col++) {
        System.out.print("\t");
      }
      if (rows > 1 && rows < n) {
        System.out.print("*\t");
      }
      if (rows <= n / 2) {
        s1--;
        s2 += 2;
      }
      else {
        s1++;
        s2 -= 2;
      }
      System.out.println();
    }
  }
}
