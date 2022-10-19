public class Animals {
    protected String name;
    protected double age;
    protected boolean torefAl;
    protected double kaloriot;

    public Animals() {
    }

    public Animals(String name, double age, boolean torefAl, double kaloriot) {
        this.name = name;
        this.age = age;
        this.torefAl = torefAl;
        this.kaloriot = kaloriot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setTorefAl(boolean torefAl) {
        this.torefAl = torefAl;
    }

    public void setKaloriot(double kaloriot) {
        this.kaloriot = kaloriot;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public boolean isTorefAl() {
        return torefAl;
    }

    public double getKaloriot() {
        return kaloriot;
    }

    public String toString()
    {
        return "Animal(" + "Name:" + this.name + ",Age:" + this.age + ",TorefAl:" + this.torefAl + ",kaloriot:" + this.kaloriot + ")";
    }

    public double Eat()
    {
        return (this.kaloriot * 3);
    }
}