package ch11.javaapi;

public class Member {
    String id;
    Member(String id){this.id = id;}
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member){
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }

    // 동일한 String에 대해서는
    // 동일한 hashcode가 생성된다.
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

class MemberExample {
    public static void main(String[] args) {
        Member member1 = new Member("여준영");
        Member member2 = new Member("여준영");
        System.out.println(member1.equals(member2));
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
    }
   
    
}