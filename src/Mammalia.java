public class Mammalia extends Animal {
    private String sreda;
    private int speed;

    public String getSreda() {
        return sreda;
    }

    public void setSreda(String sreda) {
        if (sreda != null) {
            this.sreda = sreda;
        } else {
            this.sreda = "не указана среда";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = -1;
        }
    }

    @Override
    void eat() {
        System.out.println("детеныши пьют молоко");
    }

    @Override
    void go() {
        System.out.println("передвигаются");
    }

    void walk() {System.out.println("метод что то делает");
    }

    @Override
    public String toString() {
        return "Mammalia{" +
                "sreda='" + sreda + '\'' +
                ", speed=" + speed +
                "} " + super.toString();
    }
}
