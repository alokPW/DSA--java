package Pattern1;

import java.util.Scanner;

public class numberSquare {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                System.err.print(j);
            }
            System.out.println();
        }
        sc.close();
}
}

