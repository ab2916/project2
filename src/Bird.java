public class Bird extends Animals{
    protected double flightHigh;
    protected double wingsLength;

    public Bird() {
    }

    public Bird(String name, double age, boolean torefAl, double kaloriot, double flightHigh, double wingsLength) {
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

    public double Eat()
    {
        return super.Eat() / 4.5;
    }

    public void Sing()
    {
        System.out.println("Tzif Tzif");
    }

    public void Dance()
    {
        System.out.println("Dancing in the nest!");
    }
}
