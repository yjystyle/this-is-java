package ch8.interfaces;

public interface RemoteControl {
    
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;
    
    // 추상 메소드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // default 메소드
    // 인터페이스의 모든 구현 객체가 가지고 있는 기본 메소드
    // java8에서 추가된 인터페이스의 멤버
    // public 특성을 갖기 때문에 public을 생략하더라도 자동적으로 컴파일 과정에서 붙게 된다.
    public default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
        } else{
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드
    // java8에서 추가된 인터페이스의 멤버
    // public 특성을 갖기 때문에 public을 생략하더라도 자동적으로 컴파일 과정에서 붙게 된다.
    static void changeBattery(){
        System.out.println("건전지를 교환합니다.");
    }
}
