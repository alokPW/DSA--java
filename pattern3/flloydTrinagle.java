package pattern3;

import java.util.Scanner;

public class flloydTrinagle  {
       public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        int a=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
              System.out.print(a+ " ");
              a++;
            }
            System.out.println();
        }
        sc.close();
}
}
