import java.util.ArrayList;

public class VehicleArrayList {
    public static void main(String[] args) {
        ArrayList<String> Vehicle = new ArrayList<>();
        Vehicle.add("BMW M4 Competiton Carbon Fibre.");
        Vehicle.add("Bugatt Chiron Pur Sport.");
        Vehicle.add("Lamborghini Aventador SVJ.");
        Vehicle.add("Koenigsegg Jesko Absolut.");
        Vehicle.add("Porsche 911 GT3 RS.");
        Vehicle.add("Ferrari SF90 Stradale.");

        System.out.print("Vehicles :" + Vehicle);

        Vehicle.remove("Ferrari SF90 Stradale.");
        System.out.println("\nUpdated Vehicles List: " + Vehicle);

        System.out.println("Vehicle 1: " + Vehicle.get(0));

        Vehicle.set(4, "Lamborghini Huracan");

        System.out.println("Vehicle Size" + Vehicle.size());

        Vehicle.clear();
    }
}