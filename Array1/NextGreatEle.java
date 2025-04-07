package Array1;

public class NextGreatEle {
    public static void main(String[]args){
        int arr[]={6,12,13,19,49,16,21,16,9};
        int arr1[] = new int[arr.length];
        int nge=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=nge;
            if (arr[i] > nge) { // Simulate Math.max without using it
                nge = arr[i];
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:arr1){
            System.out.print(ele+" ");
        }

    }
}
