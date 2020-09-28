package ch8.interfaces.defaultmethod;

// 실체메소드를 작성하지 않으면 
// 구현클래스는 추상 클래스가 되기 때문에 
// 클래스 선언부에 abstract 키워드를 추가해야 한다.
public abstract class MyClassC implements MyInterface{
}

class MyClassD extends MyClassC {
    @Override
    public void method1() {
        // TODO Auto-generated method stub
    }
}
