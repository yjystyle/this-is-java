package ch9.nestedclass.nestedinterface;

public class Button {
    // 인터페이스 타입 필드
    OnClickListner listner;

    // 매개 변수의 다형성
    void setOnClickListner(OnClickListner listner){
        this.listner = listner;
    }

    // 구현 객체의 onClick() 메소드 호출
    void touch (){
        listner.onClick();
    }


    // 중첩 인터페이스
    interface OnClickListner{
        void onClick();
    }
    
}
