import java.util.*;

public class Pattern18 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // write ur code here
    int n = scn.nextInt();
    int sp = 0;
    int st = n;
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= sp; col++) {
        System.out.print("\t");
      }
      for (int col = 1; col <= st; col++)
      {
        if ( rows > 1 && rows <= n / 2 && col > 1 && col < st) {
          System.out.print("\t");
        }
        else
        {
          System.out.print("*\t");
        }
      }
      if (rows <= n / 2)
      {
        st -= 2;
        sp++;
      }
      else
      {
        st += 2;
        sp--;
      }
      System.out.println();
    }
  }
}
