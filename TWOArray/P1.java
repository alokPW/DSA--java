package TWOArray;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][2];
        //Input
        System.out.println("Enter the marks of the  roll number and Marks");
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.println("Roll Number and Marks");
                arr[i][j]=sc.nextInt();
            }
        }
        //Output

        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        //Sum of the aray element 
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                sum=sum+arr[i][j];

            }
            System.out.println();
        }
        System.out.println(sum);




        //max in Array
        int max=arr[0][0];
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }

            }
            System.out.println();
        }
        System.out.println(max);
        sc.close();
    }
}
