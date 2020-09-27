package ch8.interfaces.defaultmethod;

public interface MyInterface {

    public void method1();

    // MyclassA 가 있는 상태에서 default Method 추가
    default void method2(){
        System.out.println("MyInterface-method2 실행");
    }
}
