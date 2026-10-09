package PATTERN;

import java.util.Scanner;
public class PATTERN_5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n=sc.nextInt();
        int c=1;
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1;  j<=n ; j++)
            {
                if(c<10) {
                    System.out.print("0"+(c++)+" ");
                }
                else
                {
                    System.out.print((c++)+" ");
                }
            }
            System.out.println();

        }

    }
}
