package algorithms.sort.compareSort.selectSort;

import common.Student;
import org.junit.Test;

public class SelectTest {
    @Test
    public void test() {
        Integer[] data1 = {1, 65, 6, 3, 8, 99, 33, 2, 23, 14, 34};
        Student[] data2 = {new Student("zhangsan", 14),
                new Student("lisi", 42),
                new Student("wangwu", 12)};

        SimpleSelectionSort.selectSort(data2);
        for (int i : data1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (Student s : data2) {
            System.out.println(s.toString());
        }
    }
}
