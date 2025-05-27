package trafficmanagement;

public class TrafficManagementSystem {
    public static void main(String[] args) {
        Signal north = new TrafficSignal("North", 10);
        Signal south = new TrafficSignal("South", 5);
        Signal east  = new TrafficSignal("East", 15);
        Signal west  = new TrafficSignal("West", 7);

        Signal[] signals = { north, south, east, west };

        int totalRounds = 2;

        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("========== Traffic Cycle Round " + round + " ==========");
            for (Signal signal : signals) {
                int greenTime = calculateGreenTime(signal.getVehicleCount());
                signal.allowTraffic(greenTime);  // Polymorphic behavior
            }
            System.out.println("----- All directions completed in Round " + round + " -----\n");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Cycle interrupted!");
            }
        }

        System.out.println("✅ All traffic signal simulations completed.");
    }

    public static int calculateGreenTime(int vehicleCount) {
        int minTime = 5;
        int maxTime = 30;
        int calculatedTime = vehicleCount;
        return Math.max(minTime, Math.min(calculatedTime, maxTime));
    }
}
