package ch7.inheritance.polymorphism;

public class Tire {
    // 최대 회전수
    public int maxRotation;
    // 누적 회전수
    public int accumulatedRotation;
    // 타이어의 위치
    public String location;

    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }
    
    public boolean roll(){
        // 누적 회전수 1증가
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation){
            System.out.println(location + " Tire 수명:" + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " Tire 펑크 ***");
            return false;
        }
    }

}