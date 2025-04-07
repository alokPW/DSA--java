
// USing  a cloumn wise printing and 
package TWOArray;



public class Transepose {
    public static void main(String[] args) {
        int a[][] = { { 1, 2,3}, { 4,5,6 },{7,8,9} };
        int m = a.length;
        int n = a[0].length;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}

// transepose and store it new array 

// package TWOArray;

// import java.util.Scanner;

// public class Transepose {
//     public static void main(String[] args) {
//         int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
//         int m = a.length;
//         int n = a[0].length;

//         int transepose[][] = new int[n][m];

//         for (int j = 0; j < n; j++) {
//             for (int i = 0; i < m; i++) {
//                 transepose[j][i] = a[i][j];
//             }
//             System.out.println();
//         }

//         for (int j = 0; j < n; j++) {
//             for (int i = 0; i < m; i++) {
//                 System.out.print(transepose[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }
