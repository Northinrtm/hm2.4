public class Car extends Transport {
    private float engineVolume;

    public Car(String brand, String model, int yearOut, String country, String color, int speedMax, float engineVolume) {
        super(brand, model, yearOut, country, color, speedMax);
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "engineVolume=" + engineVolume +
                "} " + super.toString();
    }
}