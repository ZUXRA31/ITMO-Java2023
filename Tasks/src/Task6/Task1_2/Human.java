package Task6.Task1_2;

public abstract class Human implements Information {
    private String name;
    private String lastname;
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public Human(String name,String lastname){
        this.name = name;
        this.lastname = lastname;
    }
    // public abstract void showInfo();
}
