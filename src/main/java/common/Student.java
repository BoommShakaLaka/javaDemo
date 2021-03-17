package common;

public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object student) {
        Student another = (Student) student;
        return this.name.equals(another.name);
    }

    @Override
    public int compareTo(Object o) {
        Student another = (Student) o;
        return this.age - another.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
