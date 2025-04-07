package Array;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int []arr=new int[m];
       
        // int []arr=new int[m];
        // arr[0]=12;
        // arr[1]=13;
        // arr[2]=13;
        // arr[3]=13;
        // arr[4]=13;
        for(int i=0;i<=m-1;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        System.out.println();
        for(int i=0;i<=m-1;i++){
            System.out.println(arr[i]);
            
        }
        sc.close();
    }
    
}
