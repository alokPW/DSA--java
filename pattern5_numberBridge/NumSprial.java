package pattern5_numberBridge;

import java.util.Scanner;

public class NumSprial {
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++)
            {
                System.out.print(m);
            }
            System.out.println();
        }
        sc.close();
         }
}
