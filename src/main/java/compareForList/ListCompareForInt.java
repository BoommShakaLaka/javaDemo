package compareForList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListCompareForInt {
    //基本类型取交集
    @Test
    public void test1(){
        List<String> listA = new ArrayList<String>();
        List<String> listB = new ArrayList<String>();
        listA.add("A");
        listA.add("B");

        listB.add("B");
        listB.add("C");
        listA.retainAll(listB);
        System.out.println(listA);
    }


    //基本类型取并集（去重）
    @Test
    public void test2(){
        List<String> listA = new ArrayList<String>();
        List<String> listB = new ArrayList<String>();
        listA.add("A");
        listA.add("B");

        listB.add("B");
        listB.add("C");

        // 不做第一步取的是有重复元素的并集
        listA.removeAll(listB);
        listA.addAll(listB);
        System.out.println(listA);
    }

    //基本类型取差集
    @Test
    public void test3(){
        List<String> listA = new ArrayList<String>();
        List<String> listB = new ArrayList<String>();
        listA.add("A");
        listA.add("B");

        listB.add("B");
        listB.add("C");

        listA.removeAll(listB);
        System.out.println(listA);
    }

    //对象集合取并集
    @Test
    public void test4(){
        List<User1> listA = new ArrayList<User1>();
        List<User1> listB = new ArrayList<User1>();

        User1 user1 = new User1("1", "a");
        User1 user12 = new User1("2", "b");
        User1 user13 = new User1("3", "c");

        listA.add(user1);
        listA.add(user12);
        listB.add(user12);
        listB.add(user13);

        listA.removeAll(listB);
        listA.addAll(listB);

        for(User1 u : listA) {
            System.out.println(u.getId() + ":" + u.getName());
        }
    }

    //对象集合取交集
    @Test
    public void test5(){
        List<User1> listA = new ArrayList<User1>();
        List<User1> listB = new ArrayList<User1>();

        User1 user1 = new User1("1", "a");
        User1 user12 = new User1("2", "b");
        User1 user13 = new User1("3", "c");

        listA.add(user1);
        listA.add(user12);

        listB.add(user12);
        listB.add(user13);

        listA.retainAll(listB);

        for(User1 u : listA) {
            System.out.println(u.getId() + ":" + u.getName());
        }
    }

    //对象集合取差集
    @Test
    public void test6(){
        List<User1> listA = new ArrayList<User1>();
        List<User1> listB = new ArrayList<User1>();

        User1 user1 = new User1("1", "a");
        User1 user12 = new User1("2", "b");
        User1 user13 = new User1("3", "c");

        listA.add(user1);
        listA.add(user12);

        listB.add(user12);
        listB.add(user13);

        listA.removeAll(listB);

        for(User1 u : listA) {
            System.out.println(u.getId() + ":" + u.getName());
        }
    }
}
