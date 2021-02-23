package annotation;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AnnotationTest {
    @Test
    public void test1() throws IllegalAccessException {
        User user = new User();
        user.setName("贾宝玉");
        user.setAge(15);
        user.setAddress("荣国府怡红院1111111111");
        String msg = Validator.check(user);
        System.out.println(msg);
    }
}
