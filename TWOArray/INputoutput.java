package TWOArray;

import java.util.Scanner;

public class INputoutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the aray ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int [][]grid=new int[x][y];
        int m=grid.length;
        System.out.println(m);
        int n=grid[0].length;
        System.out.println(n);
        //input
        System.out.println("Enter the the 2D  array Element  ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        //output

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }
    
        sc.close();
    }
}
