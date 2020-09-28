package ch11.javaapi;

public class Key {
    public int number;
    
    public Key(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key){
            Key compareKey = (Key) obj;
            if (this.number ==compareKey.number){
                return true;
            }
        }
        return false;
    }

    /**
     * 객체의 동등 비교를 위해서는 Object의 equals() 메소드만 재정의하지 말고
     * hashCoe() 메소드도 재정의해서 논리적 동등 객체일 경우 
     * 동등한 해시코드가 리턴되도록 해야핟나.
     */
    @Override
    public int hashCode() {
        return this.number;
    }

}
