package TWOArray;

public class SquareRotate90 {
    public static void print(int a[][]) {

        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    int a[][] = { { 1, 2,3}, { 4,5,6 },{7,8,9} };
    
}

