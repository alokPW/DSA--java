//method number =1

// package Array1;

// import java.util.Scanner;

// public class Sort0s1s{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array ");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("enter the 0s and 1s");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//        int i=0,j=size-1;
//        while (i<j) {
//         if(arr[i]==0) i++;
//        else  if(arr[j]==1)j--;
//         else if(arr[i]==1 && arr[j]==0){
//             arr[i]=0;
//             arr[j]=1;
//             i++;
//             j--;
//         }
    
//        }
//       for(int ele:arr){
//         System.out.print(ele+" ");
//       }

//         sc.close();
// }
// }


//second method
// package Array1;

// import java.util.Scanner;

// public class Sort0s1s{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array ");
//         int size=sc.nextInt();
//         int arr[]=new int[size];
//         System.out.println("enter the 0s and 1s");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
//         }
//         int zero=0;
//         int one=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]==0){
//                 zero=zero+1;
//             }
//             else if(arr[i]==1){
//               one=one+1;
//             }
//         }
//        for(int i=0;i<zero;i++){
//             arr[i]=0;
//         }
//         for(int i=one;i<size;i++){
//             arr[i]=1;
//         }
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }
    
// }

