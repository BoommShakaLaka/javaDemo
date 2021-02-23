package annotation;

public class User {
    @StringType(allowEmpty = false,name = "姓名",maxLength = 5)
    private String name;
//    @StringType(allowEmpty = false,name = "年龄",maxLength = 2)
    private int age;
    @StringType(allowEmpty = false,name = "地址",maxLength = 10)
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
