package ch7.inheritance.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice {

    public static void main(String[] args) {
        // Tire 필드에 자식타입의 객체를 대입
        Tire2 t1 = new HankookTire2();

        // 자동 타입 변환
        // 자동 타입 변환으로 선언된 Tire 타입 변수이다.
        // 이때 아래에서 tire와 t3는 동일한 HankookTire 객체를 참조한다.
        HankookTire2 t3 = new HankookTire2();
        Tire2 tire = t3;
        boolean isTrue = tire == t3;
        System.out.println(isTrue);

        // 부모 타입으로 자동 객체 변환되면 부모 클래스에 선언된 필드와 메소드만 접근 가능
        // 변수는 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스로 한정
        // 단, 메소드가 자식 클래스에서 오버라이딩되었다며 자식 클래스의 메소드가 대신 호출
        t1.tireField = null;

        t1.method1();

        
    }
}

class Tire2 {
    String tireField;
    void method1(){}
}

class HankookTire2 extends Tire2{

    String hankookField;
    
    // 오버라이드 어노테이션은 생략해도 좋으나
    // 정확히 오버라이드 되었는지 컴파일 체크를 가능하게 만든다.
    @Override
    void method1(){
        System.out.println("난 오버라이딩되었다.");
    }
}

class KumhoTire2 extends Tire2{

    public static void main(String[] args) {
     
        List<String> list = new ArrayList<>();
        // instance 를 확인하고 하지 않고 강제 타입변환을 시도하면 
        // ClassCastException!!
        if (list instanceof ArrayList){
            ArrayList<String> cList = (ArrayList<String>) list;

        }

    }
}

