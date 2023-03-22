package Task2;

public class Student {
    private String name;
    private int groupNumber;
    private int age;

    public Student() {
        this("Default", 100, 18);
    }

    public Student(String name, int groupNumber, int age) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.age = age;
    }

    public Student(String name) {
        this(name, 100, 18);
    }

    public Student(String name, int groupNumber) {
        this(name, groupNumber, 18);
    }

}
