import java.util.*;

public class Pattern3 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    for (int row = 1; row <= n; row++) 
    {
      for (int s = 1; s <= n - row; s++)
        System.out.print("\t");
      for (int col = 1; col <= row; col++)
        System.out.print("*\t");
        System.out.println();
    }
  }
}
