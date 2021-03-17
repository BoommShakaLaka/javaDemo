package algorithms.linearAlgorithm;

import common.Student;

public class LinearAlgorithm {

    //构造方法私有化，防止被new对象
    private LinearAlgorithm() {

    }

    //方法作为静态的，方便调用，无需new对象 E表示任何类型
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            //”==”比较引用地址，"equals"比较值，但类对象必须重写equals方法
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] data1 = {12, 5, 67, 43, 16, 34, 78, 4, 18};
        String[] data2 = {"abc", "bbc", "ccc", "fdf", "ddd"};
        Student[] data3 = {new Student("zhangsan",1), new Student("lisi",2), new Student("wangwu",3)};

        Student student = new Student("lisi",3);
        int re = LinearAlgorithm.search(data3, student);
        System.out.println(re);
    }
}
