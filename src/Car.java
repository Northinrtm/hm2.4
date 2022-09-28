public class Car extends Transport {
    private String statusRefill;
    private final float engineVolume;

    public float getEngineVolume() {
        return engineVolume;
    }

    @Override
    protected void refill(Boolean benz, Boolean diz, Boolean electro) {
        if (benz || diz || electro) {
            statusRefill = "заправлен";
        } else {
            statusRefill = "не заправлен";
        }
    }

    public Car(String brand, String model, int yearOut, String country, String color, int speedMax, float engineVolume) {
        super(brand, model, yearOut, country, color, speedMax);
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "engineVolume=" + engineVolume +
                "} " + super.toString() + statusRefill;
    }
}