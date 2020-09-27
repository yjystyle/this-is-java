package ch10.exception.trywithresources;

public interface AutoCloseable2 {
    void close() throws ClassNotFoundException;
}

class FileInputStream2 implements AutoCloseable{

    String file;

    FileInputStream2(String file){
        this.file = file;
    }

    @Override
    public void close() throws ClassNotFoundException {
       System.out.println("닫는다!");
    }
}
class FileInputStrem2Example {
    public static void main(String[] args) {
        try (FileInputStream2 fis2 = new FileInputStream2("test.txt")) {
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}