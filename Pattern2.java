import java.util.*;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for (int row = 1; row <= n; row++){
            for (int col = 1; col<=n-row+1;col++){
                System.out.print("*\t");
            }
        System.out.println();}

    }
}
