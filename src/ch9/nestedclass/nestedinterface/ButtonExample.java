package ch9.nestedclass.nestedinterface;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn = new Button();
        
        btn.setOnClickListner(new CallListner());
        btn.touch();

        btn.setOnClickListner(new Button.OnClickListner(){
			@Override
			public void onClick() {
                System.out.println("이렇게 해도 된다.");
			}
        });

    }
}
