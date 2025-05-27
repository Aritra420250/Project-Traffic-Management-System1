package trafficmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TrafficSignal extends Signal {

    public TrafficSignal(String direction, int vehicleCount) {
        super(direction, vehicleCount);
    }

    @Override
    public void allowTraffic(int durationInSeconds) {
        System.out.println(getCurrentTime() + " 🚦 Green light for " + direction +
                           " (" + durationInSeconds + " seconds, Vehicles: " + vehicleCount + ")");
        try {
            Thread.sleep(durationInSeconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("⚠️ Traffic interrupted for " + direction);
        }
        System.out.println(getCurrentTime() + " 🔴 Red light for " + direction + "\n");
    }

    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return "[" + sdf.format(new Date()) + "]";
    }
}
