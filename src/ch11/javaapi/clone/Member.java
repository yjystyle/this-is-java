package ch11.javaapi.clone;

import java.util.Arrays;
import java.util.List;

public class Member implements Cloneable {
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    String[] friends;

    public Member(String id, String name, String password, int age, boolean adult, String[] friends) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
        this.friends = friends;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        } catch (CloneNotSupportedException e) {
        } 
        return cloned;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.friends);
    }
 
}

class MemberExample{
    public static void main(String[] args) {
        // 원본 객체 생성
        Member original = new Member("blue", "홍길동", "12345", 25, true, new String[]{"a","b"});
        System.out.println(original.toString());
        Member cloned = original.getMember();
        String[] anotherFriends = {"c","d"};
        cloned.friends = anotherFriends;
        System.out.println(cloned.toString());
        System.out.println(original.toString());


    }
}