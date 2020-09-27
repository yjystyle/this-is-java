package ch9.nestedclass;

// 로컬 클래스에서 사용 제한
public class Outter {

    // java 7 이전
    // 메소드의 매개변수나 로컬 변수를 로컬 클래스에서 사용할 때,
    // 로컬 클래스의 객체는 메소드 실행이 끝나고 힙 메모리에 상주하지만
    // 매개 변수나 로컬 변수는 메소드 실행이 끝나면 스택 메모리에서 사라지기 때문
    // 그래서 final 키워드로 선언
    public void method1(final int arg){
        final int localVariable = 1;
        // arg = 100;(x)
        // localVariable = 100;
        class Inner {
            public void method(){
                int result = arg + localVariable;
            }
        }
    }

    // java 8 이후
    public void method2(int arg){
        int localVariable = 1;
        // arg = 100; (x)
        // localVariable = 100 (x)
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    String field = "Outter-field";
    void method(){
        System.out.println("Outter-method");
    }

    class Nested{
        String field = "Nested-field";
        void method(){
            System.out.println("Nested-method");
        }
        void print(){
            // 중첩 객체 참조
            System.out.println(this.field);
            this.method();

            // 바깥 객체 참조
            System.out.println(Outter.this.field);
            Outter.this.method();
        }
        
    }
    
}
