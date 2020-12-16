import compareForList.User1;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
        User1 user1 = new User1("1", "张三");

        List<User1> listold = new ArrayList<User1>();
        listold.add(user1);
        listold.add(user1);
        List<User1> listnew = new ArrayList<User1>();
//        listnew

    }

    @Test
    public void test9() {
        User1 user1 = new User1("1", "张三");
        List<User1> listold = new ArrayList<User1>();
        listold.add(user1);
        User1 user12 = new User1("2", "张三");
        listold.add(user12);
        User1 user13 = new User1("3", "张三");
        listold.add(user13);
        User1 user14 = new User1("4", "张三");
        listold.add(user14);
        User1 user15 = new User1("5", "张三");
        listold.add(user15);
//        for (User user1:listold){
//            listold.remove(user1);
//        }
//        for (int i = 0;i<listold.size();i++){
//            if (i%2 == 0){
//                listold.remove(i);
//            }
//        }

        Iterator<User1> iterator = listold.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            User1 user = iterator.next();
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

    @Test
    public void test15() {
        Integer a = 1;
        Boolean b = test16(a);
        System.out.println(a);


    }

    public Boolean test16(Integer a) {
        return null;


    }

    @Test
    public void test17() {
        List<User1> list = new ArrayList<>();
//        list = null;
        if (list == null) {
            System.out.println("null");
        } else if (list.isEmpty()) {
            System.out.println("空");
        }
        User1 user1 = test18();
        if ("1".equals(user1.getId()) && user1 != null) {
            System.out.println("success");
        }
    }


    public User1 test18() {
        return null;
    }

    @Test
    public void test19() {
        List<User1> list = new ArrayList<>();
        test19_1(list);
        System.out.printf("L");
    }

    private void test19_1(List<User1> list) {
        User1 user1 = new User1("1", "z");
        User1 user12 = new User1("2", "x");
        list.add(user1);
        list.add(user12);
        return;
    }

    @Test
    public void test20() {
        test20_1();
        System.out.println("234");
    }

    public void test20_1() {
        List<User1> list = new ArrayList<>();
        test19_1(list);
        for (User1 user1 : list) {
            return;
        }
        System.out.printf("");
    }

    @Test
    public void test21() {
        String s = "ABXS";
        System.out.println(s.substring(0, 1));
    }

    private static final List<String> CG_LOCAT_START_CODE = Arrays.asList("J", "K", "L", "X", "Y", "Z");

    @Test
    public void test22_1() {
        Boolean bl = test22("E0001");
        System.out.print(bl);
    }

    public boolean test22(String local) {
        String start1 = local.substring(0, 1);
        String start2 = local.substring(0, 2);
        return !CG_LOCAT_START_CODE.contains(start1) && !start2.equals("ZE");
    }

    @Test
    public void test23() {
        Long b = 1234L;
        Long a = Long.getLong(String.valueOf(b));
        System.out.println(a);
    }

    @Test
    public void test24() {
        List<User1> list1 = new ArrayList<>();
        List<User1> list2 = new ArrayList<>();
        List<User1> listAll = new ArrayList<>();
        User1 user1 = new User1("1", "aa");
        User1 user12 = new User1("1", "aa");
        User1 user13 = new User1("1", "aa");
        list1.add(user1);
        list1.add(user12);
        list2.add(user13);
        listAll.addAll(list1);
        listAll.addAll(list2);
        System.out.printf("");
    }

    @Test
    public void test25() {
        FlagObject flagObject = new FlagObject();
        flagObject.setFlag(true);
        System.out.println(flagObject.getFlag());
        test25_1(flagObject);
        System.out.println(flagObject.getFlag());
    }

    public void test25_1(FlagObject flagObject) {
        flagObject.setFlag(false);
    }

    @Test
    public void test26() {
        String x = "string";
        String y = "string";
        String z = new String("string");
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));

        System.out.println(x.hashCode() + " " + y.hashCode() + " " + z.hashCode());
        System.out.println(System.identityHashCode(x) + " " + System.identityHashCode(y) + " " + System.identityHashCode(z));
    }

    @Test
    public void test27() {
        String str1 = "通话";
        String str2 = "重地";
        System.out.println(str1.hashCode() + " " + str2.hashCode());
        System.out.println(String.format("str1：%d | str2：%d", str1.hashCode(), str2.hashCode()));
        System.out.println(str1.equals(str2));
    }


    public void test28(){
        System.out.println(20201216);
    }

    public void test28_1(){

    }
}
