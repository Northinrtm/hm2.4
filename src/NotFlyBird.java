public class NotFlyBird  extends Bird{
    private final String tipPeredvizheniya = "ходит";
    public String getTipPeredvizheniya() {
        return tipPeredvizheniya;
    }

    @Override
    void eat() {
    }

    @Override
    void go() {
    }

    void walk(){}

    @Override
    public String toString() {
        return "NotFlyBird{" +
                "tipPeredvizheniya='" + tipPeredvizheniya + '\'' +
                "} " + super.toString();
    }
}
