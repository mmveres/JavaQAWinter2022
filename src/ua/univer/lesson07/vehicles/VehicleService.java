package ua.univer.lesson07.vehicles;

public class VehicleService {
    public static Vehicle getMaxSpeedVehicle(Vehicle[] vehicles) {
        Vehicle maxSpeedVehicle = vehicles[0];
        for (var vehicle: vehicles) {
            if (vehicle.getSpeed()> maxSpeedVehicle.getSpeed()){
                maxSpeedVehicle = vehicle;
            }
        }
        return maxSpeedVehicle;
    }
    public static Vehicle getMinAgeVehicle(Vehicle[] vehicles) {
        Vehicle minAgeVehicle = vehicles[0];
        for (var vehicle: vehicles) {
            if (vehicle.getAge()< minAgeVehicle.getAge()){
                minAgeVehicle = vehicle;
            }
        }
        return minAgeVehicle;
    }
}
