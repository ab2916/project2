public class Bird extends Animals{
    protected double flightHigh;
    protected double wingsLength;

    public Bird() {
    }

    public Bird(String name, double age, boolean torefAl, int kaloriot, double flightHigh, double wingsLength) {
        super(name, age, torefAl, kaloriot);
        this.flightHigh = flightHigh;
        this.wingsLength = wingsLength;
    }

    public void setFlightHigh(double flightHigh) {
        this.flightHigh = flightHigh;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    public double getFlightHigh() {
        return flightHigh;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    @Override
    public String toString() {
        return "Bird(" + "flightHigh:" + flightHigh + ",wingsLength:" + wingsLength + ")";
    }
}
