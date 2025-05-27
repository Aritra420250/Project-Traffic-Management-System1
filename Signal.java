package trafficmanagement;

public abstract class Signal {
    protected String direction;
    protected int vehicleCount;

    public Signal(String direction, int vehicleCount) {
        this.direction = direction;
        this.vehicleCount = vehicleCount;
    }

    public String getDirection() {
        return direction;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public abstract void allowTraffic(int durationInSeconds);
}

