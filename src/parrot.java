public class parrot extends Bird{
    protected boolean talk;

    public parrot() {
    }

    public parrot(String name, double age, boolean torefAl, int kaloriot, double flightHigh, double wingsLength, boolean talk) {
        super(name, age, torefAl, kaloriot, flightHigh, wingsLength);
        this.talk = talk;
    }

    public void setTalk(boolean talk) {
        this.talk = talk;
    }

    public boolean isTalk() {
        return talk;
    }

    @Override
    public String toString() {
        return "parrot(" + "talk:" + talk + ")";
    }
}
