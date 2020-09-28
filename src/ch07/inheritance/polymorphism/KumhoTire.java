package ch7.inheritance.polymorphism;

public class KumhoTire extends Tire {

    KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + " KuhmHoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** "+ location + " KuhmHoTire 펑크 ***");
            return false;
        }
    }

    
    
}