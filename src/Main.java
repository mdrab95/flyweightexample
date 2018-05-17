public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[11];
        for (int i=0; i<10; i++){
            vehicles[i] = VehicleFactory.createVehicle("blue");
        }
        vehicles[10] = VehicleFactory.createVehicle("red");

        System.out.println("References:");
        int differentObjects = 0;
        for (int i=0; i<11; i++){
            System.out.println("Vehicle " + (i+1) + ": " + vehicles[i].toString());
            if(i<10) {
                if (!vehicles[i].equals(vehicles[i + 1])) {
                    differentObjects += 1;
                }
            }
        }
        System.out.println("Total number of different objects: " + (differentObjects+1));
    }
}
