package Task4;

public class Main {
    public static void main(String[] args) {
        FirstClass first = new FirstClass("Thread 1", 100);
        SecondClass second = new SecondClass("Thread 2");

        first.start();
        second.start();
    }
}
