package Task3;

public class Car {
    private String colour = "Red";
    private String name = "Default Lada";
    private int weight = 1500;

    public Car() {
    }

    public Car(String colour, String name, int weight) {
        this.colour = colour;
        this.name = name;
        this.weight = weight;
    }

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(String colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println("Цвет: " + colour + ";\nНазвание: " + name + ";\nВес: " + weight);
    }

}

class JavaProgram2 {
    public static void main(String[] args) {
        Car car = new Car("Black", "Vesta", 2000);
        Car car2 = new Car("White", "BMW", 2500);
        car.showInfo();
        car2.showInfo();
    }
}
