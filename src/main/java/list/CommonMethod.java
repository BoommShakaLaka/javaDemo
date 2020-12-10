package list;

import compareForList.User1;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CommonMethod {

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
}
