package PATTERN;
import java.util.*;
public class PATTERN_4_HOLLOW_SQUARE {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1;  j<=n ; j++)
            {
                if(i==n||j==n||i==1||j==1) {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();

        }

    }
}
