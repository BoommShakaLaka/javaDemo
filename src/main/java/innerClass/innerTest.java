package innerClass;

import org.junit.Test;

public class innerTest {
    @Test
    public void test1(){
        A a = new A();
        A.B b = new A().new B();
        a.externalSay();
        b.innerSay();
    }
}
