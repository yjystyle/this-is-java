package ch9.nestedclass.practice;

public class Anonymous {
    // 필드
    Vehicle field = new Vehicle(){
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");            
        }
    };
    
    void method1(){
        Vehicle localVar = new Vehicle(){
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");            
            }
        };
        localVar.run();
    }

    void method2(Vehicle vehicle){
        vehicle.run();
    }

}
