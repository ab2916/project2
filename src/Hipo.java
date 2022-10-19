public class Hipo extends Mammal{
    protected int fatPerc;

    public Hipo() {
    }

    public Hipo(String name, double age, boolean torefAl, double kaloriot, double milkKal, int pregMonth, int fatPerc) {
        super(name, age, torefAl, kaloriot, milkKal, pregMonth);
        this.fatPerc = fatPerc;
    }

    public void setFatPerc(int fatPerc) {
        this.fatPerc = fatPerc;
    }

    public int getFatPerc() {
        return fatPerc;
    }

    @Override
    public String toString() {
        return "Hipo(" + "fatPerc:" + fatPerc + ")";
    }
}
