public class Earthwater extends Animal {
    private final String sreda = "вода и земля";

    public String getSreda() {
        return sreda;
    }

    @Override
    void eat() {
    }

    @Override
    void go() {
    }

    void hunt() {
    }

    @Override
    public String toString() {
        return "Eartweater{" +
                "sreda='" + sreda + '\'' +
                "} " + super.toString();
    }
}
