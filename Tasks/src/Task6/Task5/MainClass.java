package Task6.Task5;

import java.util.Scanner;

public abstract class MainClass {
    protected Scanner scanner = new Scanner(System.in);
    private int age;
    public MainClass(int age){
        this.age = age;
    }
    public void get(){
        age = scanner.nextInt();
        System.out.println(age);
    }


}
