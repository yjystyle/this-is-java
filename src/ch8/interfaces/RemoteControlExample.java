package ch8.interfaces;

public class RemoteControlExample {
    public static void main(String[] args) {
        
        // 인터페이스 변수와 구현 객체
        // RemoteControl rc;
        // rc = new Television();
        // rc = new Audio();

        // 익명 구현 클래스
        // RemoteControl rc = new RemoteControl(){
        //     @Override
        //     public void turnOn() {
        //         // TODO Auto-generated method stub
                
        //     }
        //     @Override
        //     public void turnOff() {
        //         // TODO Auto-generated method stub
                
        //     } 
        //     public void setVolume(int volume){

        //     }

        // };

        RemoteControl rc = null;
        rc = new Television();
        rc.turnOn();
        rc.turnOff();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        // 재정의된 default 메소드 호출
        rc.setMute(true);

        // 정적 메소드 사용
        RemoteControl.changeBattery();
        
    }
}
