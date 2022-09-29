public class FlyBird extends Bird{
    private final String tipPeredvizheniya = "Летает и иногда ходит";

    public String getTipPeredvizheniya() {
        return tipPeredvizheniya;
    }

    @Override
    void eat() {
    }

    @Override
    void go() {
        super.go();
    }

    void fly(){}

    @Override
    public String toString() {
        return "FlyBird{" +
                "tipPeredvizheniya='" + tipPeredvizheniya + '\'' +
                "} " + super.toString();
    }
}
