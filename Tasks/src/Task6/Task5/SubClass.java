package Task6.Task5;

public class SubClass extends MainClass {
    private String name;
    public SubClass(int age, String name){
        super(age);
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
}
