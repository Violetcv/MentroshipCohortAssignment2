import java.util.*;

public class Pattern12 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    int n = scn.nextInt();
    int num1 = 0;
    int num2 = 1;
    for (int rows = 0; rows < n; rows++)
    {
      for (int col = 0; col <= rows; col++)
      {
        System.out.print(num1 + "\t");
        int num3 = num1 + num2;
        num1 = num2;
        num2 = num3;
      }
      System.out.println();
    }
  }
}
