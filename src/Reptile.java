public class Reptile extends Animals{
    protected double tailLength;

    public Reptile() {
    }

    public Reptile(String name, double age, boolean torefAl, double kaloriot, double tailLength) {
        super(name, age, torefAl, kaloriot);
        this.tailLength = tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    @Override
    public String toString() {
        return "Reptile(" + "tailLength:" + tailLength + ")";
    }
}
