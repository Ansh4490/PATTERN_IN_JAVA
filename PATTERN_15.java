package PATTERN;
import java.util.*;
public class PATTERN_15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == i || j == 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}


