package ua.univer.lesson07.vehicles;

import org.junit.Assert;

import static org.junit.Assert.*;

public class VehicleServiceTest {

    @org.junit.Test
    public void getMaxSpeedVehicle() {
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car(1, "Ford", 120, 5);
        vehicles[1] = new Ship(2, "Ship1", 20, 10, "Odessa", 100);
        Vehicle maxSpeedVehicle = VehicleService.getMaxSpeedVehicle(vehicles);
        Assert.assertEquals(120,maxSpeedVehicle.getSpeed(), 0.01);
    }

    @org.junit.Test
    public void getMinAgeVehicle() {
    }
}