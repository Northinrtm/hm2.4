public class FlyBird extends Bird {
    private final String moveType = "Летает и иногда ходит";

    public String getMoveType() {
        return moveType;
    }

    @Override
    void eat() {
        System.out.println("клюет");
    }

    @Override
    void go() {
        System.out.println("птица летит");
    }

    void fly() {System.out.println("метод что то делает");
    }

    @Override
    public String toString() {
        return "FlyBird{" +
                "moveType='" + moveType + '\'' +
                "} " + super.toString();
    }
}
