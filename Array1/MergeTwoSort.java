// package Array1;

// import java.util.Scanner;

// public class MergeTwoSort {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of  first array ");
//         int n=sc.nextInt();
//         int arr1[]= new int[n];
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();  
//         }
//         System.out.println("Enter the size of  Second array ");
//         int m=sc.nextInt();
//         int arr2[]= new int[m];
//         for(int i=0;i<m;i++){
//             arr2[i]=sc.nextInt();  
//         }
//         int arr3[]=new int[n+m];
//         int i=0,j=0,k=0;
//         while(i<arr1.length && j<arr2.length){
//             if(arr1[i]<=arr2[j]){
//                 arr3[k]=arr1[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 arr3[k]=arr2[j];
//                 j++;
//                 k++;
//             }

//         }
//         if(i==arr1.length){//now take elelments from arr2 only
//             while(j<arr2.length){
//                 arr3[k]=arr2[j];
//                 j++;
//                 k++;
//             }
//         }
//         if(j==arr2.length){//now take elelments from arr1 only
//             while(i<arr1.length){
//                 arr3[k]=arr1[i];
//                 i++;
//                 k++;
//             }
//         }
//         for(int ele:arr3){
//             System.out.print(ele+" ");
//         }
//         sc.close();
//     }
// }



//method number-2
package Array1;

import java.util.Scanner;

public class MergeTwoSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of Second array ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int o = n + m;
        int arr3[] = new int[o];
        int i = n - 1, j = m - 1, k = o - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr2[j]; // Corrected: Copy from arr2
                j--;
                k--;
            } else {
                arr3[k] = arr1[i]; // Corrected: Copy from arr1
                i--;
                k--;
            }
        }
        if(j>=0){
        while (j >= 0) { // Corrected condition: Check if j is still valid
            arr3[k] = arr2[j];
            j--;
            k--;
        }
        }
        if(i>=0){
        while (i >= 0) { // Corrected condition: Check if i is still valid
            arr3[k] = arr1[i];
            i--;
            k--;
        }
    }

        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}