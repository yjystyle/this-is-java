package ch9.nestedclass.nestedinterface;

public class CallListner implements Button.OnClickListner{

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }

    
}
