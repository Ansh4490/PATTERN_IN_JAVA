package PATTERN;
import java.util.*;
public class PROGRAM_20 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int count=1;
            for (int j = 1; j <=((2*i)-1) ; j++) {
                if(j<i) {
                    System.out.print(count++ +" ");
                }
                else{
                    System.out.print(count-- +" ");
                }
            }
            System.out.println();
        }

    }
}
