package innerClass;

import org.junit.Test;

public class anonymityInnerTest {
    C c = new C();


    @Test
    public void test1() {
        filter(new Function() {
            @Override
            public Object call(Object v1) {
                return v1 + "abc";
            }
        });
    }


    private void filter(Function f) {
        for (int i = 0; i < 5; i++) {
            System.out.println(f.call(i));
        }
    }

}
