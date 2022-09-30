public class Earthwater extends Animal {
    private final String sreda = "вода и земля";

    public String getSreda() {
        return sreda;
    }

    @Override
    void eat() {
        System.out.println("землеводное ест");
    }

    @Override
    void go() {
        System.out.println("землеводное идет");
    }

    void hunt() {System.out.println("метод что то делает");
    }

    @Override
    public String toString() {
        return "Eartweater{" +
                "sreda='" + sreda + '\'' +
                "} " + super.toString();
    }
}
