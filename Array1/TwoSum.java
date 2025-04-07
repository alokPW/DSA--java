
package Array1;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={5,4,5,6,32};
        int sum=10;
        for(int i=0;i<5;i++){
            int rem=sum-arr[i];  // Corrected this line
            for(int j=i+1;j<5;j++){  // Changed j=1 to j=i+1
                if(rem==arr[j]){
                    System.out.println("nums "+arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}


