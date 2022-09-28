public class Bus extends Transport {
    private String statusRefill;

    public Bus(String brand, String model, int yearOut, String country, String color, int speedMax) {
        super(brand, model, yearOut, country, color, speedMax);
    }

    @Override
    protected void refill(Boolean benz, Boolean diz, Boolean electro) {
        {
            if (benz || diz) {
                statusRefill = "заправлен";
            } else {
                statusRefill = "не заправлен";
            }
        }
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString() + statusRefill;
    }
}
