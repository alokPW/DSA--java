package Array;

import java.util.Scanner;

public class secMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entere a size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter a array  of the element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mx=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }

        int  smx=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>smx){
                if(arr[i]!=mx){
                    smx=arr[i];
                }
            }
        }

        System.out.println("Maximum value is "+mx);
        System.out.println("second Maximum value is "+smx);
        sc.close();
    }
    
}
