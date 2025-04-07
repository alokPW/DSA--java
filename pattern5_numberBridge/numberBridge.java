

package pattern5_numberBridge;

import java.util.Scanner;

public class  numberBridge {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        for(int i=1;i<=2*m-1;i++){
              System.out.print(i+" ");
        }
         System.out.println();
         m--;
        
         for(int i=1;i<=m;i++){
            int a=1;
            for(int j=1;j<=m+1-i;j++){
                System.out.print(a++ +" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            // nsp +=2;
            for(int j=5;j<=m+5-i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
         }
        sc.close();
    }
}
//  1#####7
//  ### ###
//  ##   ##
//  #     #



