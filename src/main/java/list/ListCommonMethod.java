package list;

import common.User;
import compareForList.User1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
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
}
