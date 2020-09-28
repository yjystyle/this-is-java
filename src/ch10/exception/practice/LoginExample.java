package ch10.exception.practice;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void login(String id, String password) throws NotExistIdExcpetion, WrongPasswordException {
        // id가 "blue"가 아니라면 NotExistIdException 발생시킴
        if (!id.equals("blue")){
            throw new NotExistIdExcpetion("아이디가 존재하지 않습니다.");
        } 

        if (!password.equals("12345")){
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
