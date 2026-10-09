package PATTERN;

import java.util.Scanner;

public class PATTERN_6 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++)
        {
            for (int j = 1;  j<=n ; j++)
            {
                if(i*j<10) {
                    System.out.print("0"+(i*j)+" ");
                }
                else
                {
                    System.out.print((i*j)+" ");
                }
            }
            System.out.println();

        }

    }
}

