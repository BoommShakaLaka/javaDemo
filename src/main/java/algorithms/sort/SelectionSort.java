package algorithms.sort;

import org.junit.Test;

public class SelectionSort {
    int[] arr1 = {12, 5, 66, 4, 22, 54, 12, 66, 43, 65, 2, 3, 1, 5, 79};
    int[] arr2 = {12, 5, 66, 4, 22, 54, 12, 66, 43, 65, 2, 3, 1, 5, 79};

    @Test
    public void sort1() {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {

                }
            }
        }
    }
}
