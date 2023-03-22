package Task7;


public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane(125);
        Plane plane2 = new Plane(165);
        plane1.getWing().showWeightWing();
        plane2.getWing().showWeightWing();
    }
}