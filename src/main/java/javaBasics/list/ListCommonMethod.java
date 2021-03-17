package javaBasics.list;

import common.User;
import compareForList.User1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCommonMethod {

    @Test
    public void addAllTest() {
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
    public void removeTest1() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            userList.add(user);
        }

        Iterator<User> it = userList.iterator();
        while (it.hasNext()) {
            User user = it.next();
            if (user.getId() % 2 == 0) {
                it.remove();
            }
        }

        for (User user : userList) {
            System.out.println(user.getId());
        }
    }

    /**
     * remove(objet)、remove(index) 会导致list序号与值错乱，不提倡使用
     *
     *
     */
    @Test
    public void removeTest2() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            userList.add(user);
        }

        userList.remove(4);
        userList.remove(5);

        for (User user : userList) {
            System.out.println(user.getId());
        }
    }

    @Test
    public void arrayListTest() {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        //第一种遍历方法使用 For-Each 遍历 List
        for (String str : list) {            //也可以改写 for(int i=0;i<list.size();i++) 这种形式
            System.out.println(str);
        }

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i = 0; i < strArray.length; i++) //这里也可以改写为  for(String str:strArray) 这种形式
        {
            System.out.println(strArray[i]);
        }

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext())//判断下一个元素之后有值
        {
            System.out.println(ite.next());
        }
    }

    @Test
    public void linkedListTest() {
        List list = new LinkedList();
    }
}
