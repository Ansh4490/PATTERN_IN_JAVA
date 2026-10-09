package PATTERN;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class PROGRAM_25 {
    static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int count=(i*(i+1))/2;
            for (int j = 1; j <=i ; j++) {
                System.out.print(count--);
                if(j<i)
                {
                    System.out.print("*");
                }

            }
            System.out.println();

        }
    }
}
