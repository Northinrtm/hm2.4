public class Train extends Transport {
    private int fare;
    private int speedTrain;
    private String nameStationDeparture;
    private int numberWagons;
    private String nameStationFinal;

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        if (fare <= 0) {
            this.fare = -1;
        } else {
            this.fare = fare;
        }
    }

    public int getSpeedTrain() {
        return speedTrain;
    }

    public void setSpeedTrain(int speedTrain) {
        if (speedTrain <= 0) {
            this.speedTrain = -1;
        } else {
            this.speedTrain = speedTrain;
        }
    }

    public String getNameStationDeparture() {
        return nameStationDeparture;
    }

    public void setNameStationDeparture(String nameStationDeparture) {
        if (nameStationDeparture != null) {
            this.nameStationDeparture = nameStationDeparture;
        } else {
            this.nameStationDeparture = "Станция не указана";
        }
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons <= 0) {
            this.numberWagons = -1;
        } else {
            this.numberWagons = numberWagons;
        }
    }

    public String getNameStationFinal() {
        return nameStationFinal;
    }

    public void setNameStationFinal(String nameStationFinal) {
        if (nameStationFinal != null) {
            this.nameStationFinal = nameStationFinal;
        } else {
            this.nameStationFinal = "Станция не указана";
        }
    }

    public Train(String brand, String model, int yearOut, String country, String color, int speedMax, int fare, int speedTrain, String nameStationDeparture, int numberWagons, String nameStationFinal) {
        super(brand, model, yearOut, country, color, speedMax);
        this.fare = fare;
        this.speedTrain = speedTrain;
        this.nameStationDeparture = nameStationDeparture;
        this.numberWagons = numberWagons;
        this.nameStationFinal = nameStationFinal;
    }

    @Override
    public String toString() {
        return "Train{" +
                "fare=" + fare +
                ", speedTrain=" + speedTrain +
                ", nameStationDeparture='" + nameStationDeparture + '\'' +
                ", numberWagons=" + numberWagons +
                ", nameStationFinal='" + nameStationFinal + '\'' +
                "} " + super.toString();
    }
}
