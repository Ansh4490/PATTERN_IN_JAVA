package PATTERN;
import java.util.*;
public class PATTERN_18 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=((2*i)-1) ; j++)
                 {
                     System.out.print("*");
            }
            System.out.println();
        }
    }
}
