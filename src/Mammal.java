public class Mammal extends Animals{
    protected int milkKal;
    protected int pregMonth;

    public Mammal() {
    }

    public Mammal(String name, double age, boolean torefAl, int kaloriot, int milkKal, int pregMonth) {
        super(name, age, torefAl, kaloriot);
        this.milkKal = milkKal;
        this.pregMonth = pregMonth;
    }

    public void setMilkKal(int milkKal) {
        this.milkKal = milkKal;
    }

    public void setPregMonth(int pregMonth) {
        this.pregMonth = pregMonth;
    }

    public int getMilkKal() {
        return milkKal;
    }

    public int getPregMonth() {
        return pregMonth;
    }

    @Override
    public String toString() {
        return "Mammal(" + "milkKal:" + milkKal + ",pregMonth:" + pregMonth + ")";
    }
}
