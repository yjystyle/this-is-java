package ch8.interfaces.polymorphism;

public class DriverExample {
    
    public static void main(String[] args) {
        
        Driver driver = new Driver();
        // driver의 매개변수는 Vehicle 타입이므로 Vehicle vehicle = new Bus();
        // 가 되어 자동 타입변환이 이루어졌다.
        driver.drive(new Bus());
        driver.drive(new Taxi());
        
    }
}
