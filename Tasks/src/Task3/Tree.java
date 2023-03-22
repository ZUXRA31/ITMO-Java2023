package Task3;

/*
●	Конструктор, который устанавливает только возраст и название;
●	Конструктор, который устанавливает все переменные в классе;
●	Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».

 */
public class Tree {
    private int age;
    private boolean isLive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, boolean isLive, String name) {
        this.age = age;
        this.isLive = isLive;
        this.name = name;
    }

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }


}

class JavaProgram4 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(100, true, "Дуб");
        Tree tree2 = new Tree(50, "Клён");
    }
}
