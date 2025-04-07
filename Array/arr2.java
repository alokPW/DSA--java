package Array;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the how muvh students in class");
        int m=sc.nextInt();
        int []arr=new int[m];
        System.out.println("enter the marks of the students");
        for(int i=0;i<=m-1;i++)
        {
            arr[i]=sc.nextInt();
           
        }
        System.out.println();
        for(int i=0;i<=m-1;i++){
            if(arr[i]<=35){
                System.out.println(arr[i]+"you are Fail bad luck try next time!");
             }
             else{
                System.out.println(arr[i]+"good marks! you are pass");
             }
        }
    sc.close();
}
}
