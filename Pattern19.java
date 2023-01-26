import java.util.*;

public class Pattern19 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    for (int rows = 1; rows <= n; rows++) {
      for (int col = 1; col <= n; col++) {
        if (rows == 1) // row 1
        {
          if (col == n || col <= n / 2 + 1) {
            System.out.print("*\t");
          } else {
            System.out.print("\t");
          }
        }
        else if (rows <= n / 2) //row 2
        {
          if (col == n || col == n / 2 + 1) {
            System.out.print("*\t");
          }
          else {
            System.out.print("\t");
          }
        }
        else if (rows == n / 2 + 1) //row 3
        {
          System.out.print("*\t");
        }
        else if (rows < n) //row 4
        {
          if (col == 1 || col == n / 2 + 1)
          {
            System.out.print("*\t");
          }
          else
          {
            System.out.print("\t");
          }
        }
        else//row 5
        {
          if (col == 1 || col >= n / 2 + 1)
          {
            System.out.print("*\t");
          }
          else {
            System.out.print("\t");
          }
        }
      }
      System.out.println();
    }
  }
}
