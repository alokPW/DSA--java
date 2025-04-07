// package AssigmentArray;

public class duplicatArr {
    public static void main(String[] args){
        int arr[] = {12, 13, 14, 151, 21, 23, 12, 151};
        int n = arr.length;

        for(int i = 0; i < n; i++) {  
            for(int j =  1; j < n; j++) { // ✅ Fixed condition
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]); 
                }
            }
        }
    }
}
