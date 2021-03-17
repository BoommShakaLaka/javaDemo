package algorithms.linearAlgorithm;

import org.junit.Test;

public class Test1 {
    @Test
    public void test1() {
//        LinearAlgorithm l = new LinearAlgorithm();
    }

    @Test
    public void test2() {
        long time;
        int num = 1000000;
        long time1 = System.nanoTime();
        Integer[] data = CreateArray.getArray(num);
        long time2 = System.nanoTime();
        time = time2 - time1;
        System.out.println(time / 1000000000.0);

        for (int i = 0; i <100 ; i++) {
            int result = LinearAlgorithm.search(data, num);
        }
        long time3 = System.nanoTime();
        time = time3 - time2;
        System.out.println(time / 1000000000.0);
    }
}
