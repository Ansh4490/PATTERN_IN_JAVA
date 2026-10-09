package PATTERN;

import java.util.Scanner;

public class PATTERN_7 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n=sc.nextInt();
        int c;
        for (int i = 0; i <n ; i++)
        {
            c=i+1;
            for (int j = 0;  j<n ;j++)
            {
                System.out.print((c++) +" ");
            }

            System.out.println();

        }

    }
}
