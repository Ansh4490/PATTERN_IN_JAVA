package PATTERN;
import java.util.*;
public class PATTERN_14 {
    static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
             for (int i = 1; i <=n ; i++) {
                 for (int k = 1; k <=n-i ; k++)
               {
                    System.out.print(" ");

               }
               for (int j = 1; j <=i ; j++)
                 {
                if (j==i||j==1||i==n) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("  ");
                }
                }

                 System.out.println( );
            }


        }
    }