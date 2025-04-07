package Pattern2;
import java.util.Scanner;

public class starRevTriangle {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter a row");
       int m=sc.nextInt();
    //    for(int i=m;i>=1;i--){
    //        for(int j=1;j<=i;j++){
    //            System.out.print(j);
    //        }
    //        System.out.println();
    //    }
     //second method 
       for(int i=1;i<=m;i++){
           for(int j=1;j<=m-i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
       sc.close();
    }
}
