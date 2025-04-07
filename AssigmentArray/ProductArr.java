// package AssigmentArray;

public class ProductArr {
    public static void main(String[]args){
        int arr[]={34,3,4,5};
        int n=arr.length;
        int temp=arr[0];
        // for(int i=1;i<n;i++){
        //     temp=temp*arr[i];
        // }
        for(int i=1;i<n;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
       
       System.out.println(temp);
    }
    
}
