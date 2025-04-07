package Pattern2;
import java.util.Scanner;
public class numberTriangle {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       System.out.println("Enter a row");
       int m=sc.nextInt();
       for(int i=1;i<=m;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println();
       }
    //    for(int i=1;i<=m;i++){
    //     for(int j=1;j<=i;j++){
    //      if(i%2==0){
    //          System.out.print((char)(j+96)+" " );
    //      }
    //      else{
    //          System.out.print(i);
    //      }
    //     }
    //     System.out.println();
    // }
    //output
    //1
    //a b
    //1 2 3
    //a b c d
       sc.close();
}
}
