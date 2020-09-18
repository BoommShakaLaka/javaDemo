package algorithms.sort;

import org.junit.Test;

public class BubbleSort {
    @Test
    public void test() {
//        int[] arr = {12, 5, 66, 4, 22, 54, 12, 66, 43, 65, 2, 3, 1, 5, 79};
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int temp;//临时变量
        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
