public class NotFlyBird  extends Bird{
    private final String tipPeredvizheniya = "ходит";
    public String getTipPeredvizheniya() {
        return tipPeredvizheniya;
    }

    @Override
    void eat() {
        System.out.println("клюет");
    }

    @Override
    void go() {
        System.out.println("идет");
    }

    void walk(){}

    @Override
    public String toString() {
        return "NotFlyBird{" +
                "tipPeredvizheniya='" + tipPeredvizheniya + '\'' +
                "} " + super.toString();
    }
}
