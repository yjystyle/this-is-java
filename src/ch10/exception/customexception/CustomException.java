package ch10.exception.customexception;

// 사용자 정의 예외를 일반 예외로 선언할 경우
public class CustomException extends Exception{
    CustomException(){}
    CustomException(String message){ super(message);}
        
    
    // 사용자 정의 예외 클래스도
    // 필드, 생성자, 메소드 선언들을 포함할 수 있지만
    // 대부분 생성자 선언만을 포함한다.
    // 보통 두개를 선언하는 것이 일반적인데
    // 하나는 매개 변수가 없는 기본 생성자이고,
    // String 타입의 매개변수를 갖는 생성자는
    // 상위 클래스의 생성자를 호출하여 예외 메세지를 넘겨준다.
    // 예외 메세지는 catch{} 블록의 예외 처리 코드에서 이용한다.
}

// 실행 예외로 선언할 경우
class CustomRuntimException extends RuntimeException{

}