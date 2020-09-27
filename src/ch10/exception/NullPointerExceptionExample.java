package ch10.exception;

/**
 * NullPointerException
 * 객체 참조가 없는 상태
 * null값을 갖는 참조 변수로 객체 접근 연산자인 도트를 사용해을 때 발생
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());
    }
}

// 그 외 RuntimeException
// ArrayIndexOutOfBoundException
// NumberFormatException
// ClassCastException