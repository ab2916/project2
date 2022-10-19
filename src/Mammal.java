public class Mammal extends Animals{
    protected double milkKal;
    protected int pregMonth;

    public Mammal() {
    }

    public Mammal(String name, double age, boolean torefAl, double kaloriot, double milkKal, int pregMonth) {
        super(name, age, torefAl, kaloriot);
        this.milkKal = milkKal;
        this.pregMonth = pregMonth;
    }

    public void setMilkKal(double milkKal) {
        this.milkKal = milkKal;
    }

    public void setPregMonth(int pregMonth) {
        this.pregMonth = pregMonth;
    }

    public double getMilkKal() {
        return milkKal;
    }

    public int getPregMonth() {
        return pregMonth;
    }

    @Override
    public String toString() {
        return "Mammal(" + "milkKal:" + milkKal + ",pregMonth:" + pregMonth + ")";
    }

    public double Eat()
    {
        return super.Eat() + this.milkKal;
    }
}
