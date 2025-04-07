package pattern3;

import java.util.Scanner;

public class starPlus {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        // my logic 
        // for(int i=1;i<=m;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==i && j==m-2){
        //             System.out.print("#");
        //         }
        //         else if(i==m-2&&j==j){
        //             System.out.print("#");
        //         }
        //         else{
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }
        int mid = m/2 + 1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(i==mid || j==mid){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        sc.close();
}
}
