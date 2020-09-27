package ch8.interfaces.defaultmethod;

public class MyClassB implements MyInterface{

    @Override
    public void method1() {
        System.out.println("MyClassB-method1() 실행");
    }


    // default method이기 때문에 구현이 필수적이진 않음
    @Override
    public void method2() {
        System.out.println("MyClassB-method2() 실행");
    }

    
}
