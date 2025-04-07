package Array;

import java.util.Scanner;

public class serach {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entere target element");
        int m=sc.nextInt();
        System.out.println("Entere a size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter a array  of the element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element is found");
        }
        else{
            System.out.println("Element is not found");
        }

    sc.close();
    }
}
