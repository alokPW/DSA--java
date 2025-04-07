package Pattern1;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a row");
        int m=sc.nextInt();
        System.out.println("Enter a column");
        int n=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.err.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
