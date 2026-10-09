package PATTERN;
import java.util.*;
public class PATTERN_16 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int count=i;
            for (int j=1;j<=(n-i)+1;j++) {
                System.out.print(count++);
            }
            System.out.println();
        }

    }

}
