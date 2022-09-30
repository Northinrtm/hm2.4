public class Hunter extends Mammalia {
    private final String eda = "мясо";

    @Override
    void eat() {
        System.out.println("кушают других животных");
    }

    @Override
    void go() {
        System.out.println("бегут");
    }

    void hunt() {System.out.println("метод что то делает");
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "eda='" + eda + '\'' +
                "} " + super.toString();
    }
}
