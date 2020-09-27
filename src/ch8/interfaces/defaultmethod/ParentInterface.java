package ch8.interfaces.defaultmethod;

public interface ParentInterface {
    public void method1();
    default void method2(){
        System.out.println("default method2() 입니다.");        
    }
}
