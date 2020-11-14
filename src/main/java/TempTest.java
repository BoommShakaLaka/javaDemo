import compareForList.User;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class TempTest {
    @Test
    public void test() throws ParseException {
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = "2020-09-11 12:00:00";
        Date yesterday = formatter.parse(s);
        if (today.compareTo(yesterday) > 0) {
            System.out.printf(today + "  " + yesterday);
        }
    }

    @Test
    public void test1() {
        int arr[] = {12, 23, 9, 24, 15, 3, 18};
        for (int k = 0; k < arr.length - 1; k++) {
            int min = k;
            for (int i = k + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                    if (k != min) {
                        int temp = arr[k];
                        arr[k] = arr[min];
                        arr[min] = temp;
                    }
                }
            }
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }


    public void test2(int i) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = sdf.format(new Date());
        Date date = sdf.parse(s);
        System.out.println(date);
        i++;
        System.out.println(i);
        this.test7();

    }

    @Test
    public void test5() throws ParseException {
        int i = 10;
        this.test2(i);
        System.out.println(1234);
    }

    @Test
    public void test6() {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
    }

    public void test7() {
        int a = 1 + 3;

        System.out.println("abc");
        System.out.println("123");
        System.out.println("aaa");
    }


    @Test
    public void test8() {
        User user = new User("1", "张三");

        List<User> listold = new ArrayList<User>();
        listold.add(user);
        listold.add(user);
        List<User> listnew = new ArrayList<User>();
//        listnew

    }

    @Test
    public void test9() {
        User user1 = new User("1", "张三");
        List<User> listold = new ArrayList<User>();
        listold.add(user1);
        User user2 = new User("2", "张三");
        listold.add(user2);
        User user3 = new User("3", "张三");
        listold.add(user3);
        User user4 = new User("4", "张三");
        listold.add(user4);
        User user5 = new User("5", "张三");
        listold.add(user5);
//        for (User user1:listold){
//            listold.remove(user1);
//        }
//        for (int i = 0;i<listold.size();i++){
//            if (i%2 == 0){
//                listold.remove(i);
//            }
//        }

        Iterator<User> iterator = listold.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }

    }


    @Test
    public void test10() {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        System.out.println(sb.hashCode() + ":" + sb);
        sb.append("ef");
        System.out.println(sb.hashCode() + ":" + sb);
        StringBuffer sb2 = test11(sb);
        System.out.println(sb2);
        String s = sb2.toString();
        System.out.println(s);
    }

    public StringBuffer test11(StringBuffer sb) {
        sb.append("/");
        System.out.println(sb.hashCode() + ":" + sb);
        sb.append("aaa");
        System.out.println(sb.hashCode() + ":" + sb);
        return sb;
    }

    @Test
    public void test12() {
        String a = "abc";
        String b = "abs";
        if (!a.equals(b)) {
            System.out.println(true);
        }
    }

    @Test
    public void test13() {
        String a = null;
        if (null == a || "".equals(a.trim())) {
            System.out.println(a);
        }
        System.out.println(a);
        System.out.println(a.trim());
    }

    @Test
    public void test14() {
        if (true) {
            System.out.println(1);
        }
        if (true) {
            System.out.println(2);
            return;
        }
    }
}
