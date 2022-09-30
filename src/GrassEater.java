public class GrassEater extends Mammalia {
    private final String eda = "Трава";

    public String getEda() {
        return eda;
    }

    @Override
    void eat() {
        System.out.println("Ест " + eda );
    }

    @Override
    void go() {
        System.out.println("бегут");
    }

    void pastis() {System.out.println("метод что то делает");
    }
}
