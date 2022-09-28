public class Transport {
    final private String brand;
    final private String model;
    final private int yearOut;
    final private String country;
    private String color;
    private int speedMax;

    public void setColor(String color) {

        if (color != null) {
            this.color = color;
        } else {
            this.color = "Цвет не указан";
        }
    }

    public void setSpeedMax(int speedMax) {
        if (speedMax <= 0) {
            this.speedMax = -1;
        } else {
            this.speedMax = speedMax;
        }
    }

    public Transport(String brand, String model, int yearOut, String country, String color, int speedMax) {
        this.brand = brand;
        this.model = model;
        this.yearOut = yearOut;
        this.country = country;
        this.color = color;
        this.speedMax = speedMax;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOut() {
        return yearOut;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOut=" + yearOut +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }
}
