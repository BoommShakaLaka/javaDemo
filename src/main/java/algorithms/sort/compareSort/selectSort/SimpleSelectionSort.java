package algorithms.sort.compareSort.selectSort;

public class SimpleSelectionSort {

    public static <E extends Comparable> void selectSort(E[] data) {
        int minIndex;
        E temp;
        int len = data.length;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
}
