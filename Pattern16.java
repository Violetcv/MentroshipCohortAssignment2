import java.util.*;

public class Pattern16.java {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int sp = 2 * n - 3;
    int st = 1;
    for (int rows = 1; rows <= n; rows++)
    {
      int num = 1;
      for (int col = 1; col <= st; col++)
      {
        System.out.print(num + "\t");
        num++;
      }

      for (int col = 1; col <= sp; col++)
      {
        System.out.print("	");
      }
      if ( rows == n)       {
        st--;
        num--;

      }
      for (int col = 1; col <= st; col++)
      {
        num--;
        System.out.print(num + "	");

      }
      st++;
      sp -= 2;
      System.out.println();
    }
  }
}
