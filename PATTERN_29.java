package PATTERN;
import java.util.*;
public class PATTERN_29 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N");
        int n=sc.nextInt();
        char ch='A';
        for (int i = 1; i <=n ; i++) {
                if(i%2==0) {
                    char chRev=(char)(ch+1);
                    for (int j = i; j > 0; j--) {

                        System.out.print(chRev-- +" ");
                        ch++;
                    }
                }
                    else{
                    for (int j = 1; j <=i ; j++) {


                        System.out.print(ch++ + " ");
                    }
                    }
            System.out.println();
                }

            }

        }