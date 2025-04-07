package Array;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,10);
        arr.add(2,10);
        arr.add(3,10);
        arr.add(4,10);
        arr.add(5,10);
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.add(90);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        



    }
}
