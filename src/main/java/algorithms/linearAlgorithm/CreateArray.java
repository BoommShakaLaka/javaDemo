package algorithms.linearAlgorithm;

public class CreateArray {
    private CreateArray() {
    }

    public static Integer[] getArray(int num) {
        Integer[] data = new Integer[num];
        for (int i = 0; i < num; i++) {
            data[i] = i;
        }
        return data;
    }

}
