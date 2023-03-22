package Task6.Task5;

public abstract class MainClass {
    private int age;
    public MainClass(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public abstract String getName();

}
