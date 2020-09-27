package ch9.nestedclass;

import ch9.nestedclass.A.B;

public class Main {
    public static void main(String[] args) {
        
        A a = new A();
        
        // 인스턴스 멤버 클래스 생성 (non-static inner nested class)
        A.B b = a.new B();
        b.field1 = 3;
        b.method();

        // 정적 멤버 클래스 생성 (static inner nested class)
        A.C c = new A.C();
        c.field1 = 3;
        c.method1();
        A.C.field2 = 3;
        A.C.method2();

        // 로컬 클래스 객체 생성을 위한 메소드 호출
        a.method();


    }
}
