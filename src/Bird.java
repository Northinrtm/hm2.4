public class Bird extends Animal {
    private String sreda;

    public void setSreda(String sreda) {
        if (sreda == null) {
            this.sreda = sreda;
        } else {
            this.sreda = "не указана среда";
        }
    }

    public String getSreda() {
        return sreda;
    }

    @Override
    void eat() {
        System.out.println("клюет");
    }

    @Override
    void go() {
        System.out.println("идет");
    }

    void hunt() {
    }

    @Override
    public String toString() {
        return "Bird{" +
                "sreda='" + sreda + '\'' +
                "} " + super.toString();
    }
}
