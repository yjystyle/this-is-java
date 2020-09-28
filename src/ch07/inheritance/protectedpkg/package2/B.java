package ch7.inheritance.protectedpkg.package2;

import ch7.inheritance.protectedpkg.package1.A;

public class B extends A {

    // protected class를 상속하게 되면
    // new 연산자를 사용해서 생성자를 호출할 수는 없고, 
    // 자식 생성자에서 super()로 A 생성자를 호출할 수 있다. 
    public B() {
        // 부모 생성자 호출
        super();
        // this.field = "value";
        // this.method();
    }

    public static void main(String[] args) {
        B b = new B();
    }
}