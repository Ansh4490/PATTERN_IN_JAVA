package PATTERN;
import java.util.*;
public class PATTERN_27 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch='A';
            for (int j = 1; j <=i ; j++) {
                System.out.print(ch++ +" ");

            }
            System.out.println();

        }
    }
}
