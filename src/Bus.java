public class Bus extends Transport {
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {

        if (spec != null) {
            this.spec = spec;
        } else {
            this.spec = "не указано назначение";
        }
    }


    private String spec;
    private String statusRefill;

    public Bus(String brand, String model, int yearOut, String country, String color, int speedMax, String spec) {
        super(brand, model, yearOut, country, color, speedMax);
        this.spec = spec;
    }

    @Override
    protected void refill(Boolean gasoline, Boolean diesel, Boolean electro) {
        {
            if (gasoline || diesel) {
                statusRefill = "заправлен";
            } else {
                statusRefill = "не заправлен";
            }
        }
    }

    @Override
    public String toString() {
        return "Bus{} " + super.toString() + spec + statusRefill;
    }
}
