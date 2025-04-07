package Array1;
import java.util.Scanner;

public class sort0s1s2s {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the 0s and 1s");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int mid=0,high=size-1,low=0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else{//arr[mid]==2
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;

            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
         }
        sc.close();
    }
} 




//method number=2
// package Array1;

// import java.util.Scanner;

// public class sort0s1s2s{
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
//         int two=0;
//         for(int i=0;i<size;i++){
//             if(arr[i]==0){
//                 zero=zero+1;
//             }
//             else if(arr[i]==1){
//               one=one+1;
//             }
//             else if(arr[i]==2){
//                 two=two+1;
//             }
//         }
//        for(int i=0;i<zero;i++){
//             arr[i]=0;
//         }
//         for(int i=zero;i<zero+one;i++){
//             arr[i]=1;
//         }
//         for(int i=zero+one;i<size;i++){
//             arr[i]=2;
//         }
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+" ");
//         }

//         sc.close();
//     }
    
// }


