package ch8.interfaces.polymorphism;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();        

        vehicle.run();
        // vehicle.checkFare();

        // 강제 타입 변환
        if (vehicle instanceof Bus){
            Bus bus = (Bus)vehicle;
            bus.run();
            bus.checkFare();
        }
    }
}
