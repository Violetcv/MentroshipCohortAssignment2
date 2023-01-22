import java.util.*;
public class Pattern13 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    //write your code here
    int n = scn.nextInt();
    for (int rows = 0; rows < n; rows++)
    {
      int num = 1;
      for (int col = 0; col <= rows; col++)
      {
        System.out.print(num + "\t");
        int num2 = (num * (rows - col)) / (col + 1);
        num = num2;
      }
      System.out.println();
    }
  }
}
