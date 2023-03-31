package Task6.Task3;

public class Truck extends Car {
    private int countWheels;
    private int maxWeight;
    public Truck(int w, String m, char c, float s,int countWheels,int maxWeight){
        super(w,m,c,s);
        this.countWheels = countWheels;
        this.maxWeight = maxWeight;
    }
    public void newWheels(int count){
        countWheels = count;
        System.out.println("Новое количество колёс: " + countWheels);
    }
}
