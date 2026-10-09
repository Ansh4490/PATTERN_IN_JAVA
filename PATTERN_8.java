package PATTERN;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class PATTERN_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF N");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
