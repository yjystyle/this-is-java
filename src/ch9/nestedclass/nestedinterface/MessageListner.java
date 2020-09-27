package ch9.nestedclass.nestedinterface;

public class MessageListner implements Button.OnClickListner{

    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
