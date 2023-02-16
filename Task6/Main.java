package Task6;

public class Main {
    public static void main(String[] args) {
        FirstThreadDL t1 = new FirstThreadDL();
        SecondThreadDL t2 = new SecondThreadDL();

        t1.setThread(t2);
        t2.setThread(t1);

        t1.start();
        t2.start();
    }
}
