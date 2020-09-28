package ch8.interfaces.defaultmethod;

// 인터페이스는 다중 상속이 된다.
public interface ChildInterface extends ParentInterface{
    // 원래는 default 메소드였던
    // ParentInterface 인터페이스의 디폴트 메소드
    // method2를 상속받는 인터페이스에서 추상 메소드로 오버라이딩 하게되면
    // 해당 인터페이스를 구현하는 객체에서는 반드시 선언해야 하는 메소드가 된다.
    @Override
    public void method2();
    public void method3();
}

class ChildInterfaceExample implements ChildInterface {

    @Override
    public void method1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method3() {
        // TODO Auto-generated method stub

    }

}
