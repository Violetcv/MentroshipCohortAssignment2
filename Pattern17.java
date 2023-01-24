import java.util.*;

public class Pattern17 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // write ur code here
    int n = scn.nextInt();
    int sp = n / 2;
    int st = 1;
    for (int rows = 1; rows <= n; rows++)
    {
      for (int col = 1; col <= sp; col++)
      {
        if (rows == n / 2 + 1)
        {
          System.out.print("*\t");
        }
        else {
          System.out.print("\t");
        }
      }
      for (int col = 1; col <= st; col++)
      {
        System.out.print("*\t");
      }
      if (rows <= n / 2)
      {
        st++;
      }
      else
      {
        st--;
      }
      System.out.println();
    }
  }
}
