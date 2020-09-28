package ch11.javaapi.finalize;

public class FinalizeExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = null;
        for (int i=0; i<=50; i++){
            counter = new Counter(i);
            counter = null;
            // Thread.sleep(10);
            System.gc();
        }
    }
}
