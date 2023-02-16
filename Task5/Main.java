package Task5;

public class Main {
    public static void main(String[] args) {
        Task5.FirstThread t1 = new Task5.FirstThread();
        Task5.SecondThread t2 = new Task5.SecondThread();

        t1.setThread(t2);
        t2.setThread(t1);

        t1.start();
        t2.start();
    }
}
