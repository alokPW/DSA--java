package TWOArray;

// import java.text.NumberFormat.Style;
import java.util.Scanner;

public class AddTwoarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [][]a=new int[3][3];
        int [][]b=new int[3][3];
        int [][]res=new int[3][3];
        //input
        System.out.println("Enter the First  2D  array Element  ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second  2D  array Element  ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
            System.out.println();
        }


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
