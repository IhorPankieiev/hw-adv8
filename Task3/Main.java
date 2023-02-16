package Task3;

public class Main {

    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();
        PriorityRunner thread3 = new PriorityRunner();

        thread1.setPriority(PriorityRunner.MAX_PRIORITY);
        thread2.setPriority(PriorityRunner.NORM_PRIORITY);
        thread3.setPriority(PriorityRunner.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
