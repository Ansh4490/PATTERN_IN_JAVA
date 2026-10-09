package PATTERN;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class PATTERN_28 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        char ch='A';
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(ch++ +" ");
            }
            System.out.println();
        }

    }

}
