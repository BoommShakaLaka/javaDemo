package callbackFunction;

import org.junit.Test;

public class CallbackTest {
    @Test
    public void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);

        teacher.askQuestion();
    }

}
