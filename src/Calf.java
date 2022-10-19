public class Calf extends Cow{
    protected double weight;

    public Calf() {
    }

    public Calf(String name, double age, boolean torefAl, double kaloriot, double milkKal, int pregMonth, int numOfHamlatot, double weight) {
        super(name, age, torefAl, kaloriot, milkKal, pregMonth, numOfHamlatot);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "calf(" + "weight:" + weight + ")";
    }
}
