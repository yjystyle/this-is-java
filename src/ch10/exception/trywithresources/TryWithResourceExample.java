package ch10.exception.trywithresources;

public class TryWithResourceExample {
    public static void main(String[] args) {
    
        try (FileInputStream fis = new FileInputStream("file.txt")){
            fis.read();
            // 강제 예외 발생
            throw new ClassCastException();
        } catch(ClassNotFoundException cnfe){
            System.out.println("ClassNotFoundException");
        } catch(ClassCastException e){
            System.out.println("ClassCastException");
        } catch(Exception e){
            
        }
    }
}
