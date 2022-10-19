public class Crocodile extends Reptile{
    protected boolean passTeethTest;

    public Crocodile() {
    }

    public Crocodile(String name, double age, boolean torefAl, double kaloriot, double tailLength, boolean passTeethTest) {
        super(name, age, torefAl, kaloriot, tailLength);
        this.passTeethTest = passTeethTest;
    }

    public void setPassTeethTest(boolean passTeethTest) {
        this.passTeethTest = passTeethTest;
    }

    public boolean isPassTeethTest() {
        return passTeethTest;
    }

    @Override
    public String toString() {
        return "Crocodile(" + "passTeethTest:" + passTeethTest + ")";
    }

    public double Eat()
    {
        return super.Eat() / 5;
    }
}
