public class Bus extends Transport{
    public Bus(String brand, String model, int yearOut, String country, String color, int speedMax) {
        super(brand, model, yearOut, country, color, speedMax);
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString();
    }
}
