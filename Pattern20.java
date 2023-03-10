import java.util.*;

public class Pattern20 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    for (int rows = 1; rows <= n; rows++)
    {
      for (int col = 1; col <= n; col++)
      {
        if (col == 1 || col == n)
        {
          System.out.print("*\t");
        }
        else if (rows > n / 2 && (rows == col || rows + col == n + 1))
        {
          System.out.print("*\t");
        }
        else
        {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }
}
