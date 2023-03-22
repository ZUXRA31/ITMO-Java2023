package Task7;

public class Plane {
    private Wing wing;
    public Plane(int weightWing) {
        wing = new Wing(weightWing);
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public static class Wing {
        public int weightWing;
        public Wing(int weightWing) {
            this.weightWing = weightWing;
        }
        public void showWeightWing() {
            System.out.println("Вес крыла: " + weightWing);
        }
    }
}
