
package pattern4;

import java.util.Scanner;

public class numberPalidromPYramid{
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
              System.out.print(" " +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
}
}
//   1
// 1 2 1



