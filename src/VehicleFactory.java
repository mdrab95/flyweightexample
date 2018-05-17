import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ace on 17.05.2018.
 */
public class VehicleFactory {
    private static Map<String, Vehicle> vehicles = new HashMap<String, Vehicle>();

    public static Vehicle createVehicle(String color){
        Vehicle newVehicle = vehicles.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine();
            System.out.println("The " + color + " car will be built.");
            return new Car (newEngine, newColor);
        });
        return newVehicle;
    }
}
