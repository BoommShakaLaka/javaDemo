package common;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        Student another = (Student) student;
        return this.name.equals(another.name);
    }
}
