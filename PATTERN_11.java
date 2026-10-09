package PATTERN;

import java.util.Scanner;

public class PATTERN_11 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        }

    }


