package pattern3;

import java.util.Scanner;

public class oddTriangle1 {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
              System.out.print(2*i-1+" ");
            }
            System.out.println();
        }
        sc.close();
}
}
