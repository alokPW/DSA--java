package Array1;

public class reverse {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int n=arr.length;
        int i=1,j=n-3;
        for(int ele:arr){
            System.err.print(ele+" ");
        }

        System.out.println();

        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for (int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    } 
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


//second method

// package Array1;

// public class reverse {
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40,50,60,70,80,90};
//         int n=arr.length;
//         for (int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         for(int i=0;i<n/2;i++){
//             int temp=arr[i];
//             arr[i]=arr[n-i-1];
//             arr[n-i-1]=temp; 
//         }
//         for (int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
    
// }
