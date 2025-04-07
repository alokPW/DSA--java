package pattern4;

import java.util.Scanner;

public class  starPyramid  {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        int nsp=m-1;
        int nst=1;
        for(int i=1;i<=m;i++){
          for(int j=1;j<=nsp;j++){
            System.out.print(" "+" ");
          }
          for(int j=1;j<=nst;j++){
            System.out.print("*"+" ");
          }
          nsp--;
          nst+=2;
          System.out.println();
        }
        sc.close();
}
}

