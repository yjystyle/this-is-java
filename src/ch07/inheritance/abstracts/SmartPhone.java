package ch7.inheritance.abstracts;

public class SmartPhone extends Phone{

    public SmartPhone(String owner) {
        super(owner);
        // TODO Auto-generated constructor stub
    }

    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

}
