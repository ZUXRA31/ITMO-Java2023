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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name + ", " + age + ", " + groupNumber;
    }
}
