import java.util.*;

public class Pattern15 {
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    // write ur code here
    int n = scn.nextInt();
    int sp = n / 2;
    int st = 1;
    int num = 1;
    for (int row = 1; row <= n; row++)
    {
      for (int col = 1; col <= sp; col++)
      {
        System.out.print("\t");
      }
      int cnum = num;
      for (int col = 1; col <= st; col++)
      {
        System.out.print(cnum + "\t");
        if (col <= st / 2)
        {
          cnum++;
        }
        else {
          cnum--;
        }
      }
      if (row <= n / 2)
      {
        sp--;
        st += 2;
        num++;
      } else {
        sp++;
        st -= 2;
        num--;
      }
      System.out.println();
    }
  }
}
