package Array;

import java.util.Scanner;

public class arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int []arr=new int[m];
        for(int i=0;i<=m-1;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        System.out.println();
        int Temp=0;
        for(int i=0;i<=m-1;i++){
            Temp=Temp+arr[i];
        }
        System.out.println(Temp);
    
    sc.close();
    }
}
