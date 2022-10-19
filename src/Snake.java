public class Snake extends Reptile{
    protected boolean arsi;

    public Snake() {
    }

    public Snake(String name, double age, boolean torefAl, double kaloriot, double tailLength, boolean arsi) {
        super(name, age, torefAl, kaloriot, tailLength);
        this.arsi = arsi;
    }

    public void setArsi(boolean arsi) {
        this.arsi = arsi;
    }

    public boolean isArsi() {
        return arsi;
    }

    @Override
    public String toString() {
        return "Snake(" + "arsi:" + arsi + ")";
    }

    public void Dance()
    {
        System.out.println("Crawling dance!");
    }
}
