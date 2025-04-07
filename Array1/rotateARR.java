package Array1;



public class rotateARR {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int n = arr.length;
        int k = 4;

        // Ensure k is within bounds
        k %= n;

        // Reverse different parts of the array
        rotateARR1(arr, 0, n - k - 1);
        rotateARR1(arr, n - k, n - 1);
        rotateARR1(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateARR1(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
