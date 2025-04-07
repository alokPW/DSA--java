// import java.util.Arrays;
import java.util.Scanner;

public class missingPOstiveInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // // Sort the array
        // Arrays.sort(arr);

        // Finding the smallest missing positive integer
        int missing = 1; 
        
        for (int i = 0; i < size; i++) {
            if (arr[i] == missing) {
                missing++; // Move to the next expected positive number
            }
        }
        
        System.out.println("The smallest missing positive integer is: " + missing);
        
        sc.close();
    }
}
