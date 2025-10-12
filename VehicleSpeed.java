interface Vehicle {
    void setGear(int gear);
    void brakesApplied(boolean isBrakeApplied);
}

class Car implements Vehicle {
    private int gear;
    private int speed;
    private boolean brakeStatus;
    @Override
    public void setGear(int gear) {
    this.gear = gear;
    speed = gear * 20;
}

@Override
public void brakesApplied(boolean isBrakeApplied) {
    brakeStatus = isBrakeApplied;
    if (isBrakeApplied)
        speed -= 10;

    if (speed < 0)
        speed = 0;
}

public void displaySpeed() {
    System.out.println("Vehicle's speed is " + speed + " km/h, gear is " + gear + ", brakes applied: " + brakeStatus);
    }
}

public class VehicleSpeed {
    public static void main(String[] args) {
        Car c = new Car();
        c.setGear(4);
        c.brakesApplied(true);
        c.displaySpeed();
    }
}