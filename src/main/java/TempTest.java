import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TempTest {
    @Test
    public void test() throws ParseException {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2020-09-11 12:00:00";
        Date yesterday = formatter.parse(s);
        if (today.compareTo(yesterday)>0){
            System.out.printf(today+"  "+yesterday);
        }
    }
}
