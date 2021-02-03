package algorithms.sort.compareSort.exchangeSort;

import org.junit.Test;

public class BubbleSort {


    /**
     *
     *
     *
     */
    @Test
    public void sort1() {
        int[] arr = {12, 5, 66, 4, 22, 54, 12, 66, 43, 65, 2, 3, 1, 5, 79};
//        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int temp;//临时变量
        for (int i = 0; i < arr.length - 1; i++) {   //表示趟数，一共arr.length-1次。
            for (int a : arr) {
                System.out.print(a + " ");
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




    @Test
    public void sort2() {
//      int[] arr1 = {12, 5, 66, 4, 22, 54, 12, 66, 43, 65, 2, 3, 1, 5, 79};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.println("i=" + (i + 1));
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
                System.out.print((j + 1) + ":  ");
                for (int k = 0; k < arr1.length; k++) {
                    System.out.print(arr1[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
