package Task2;

public class Main extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
        }
        System.out.println("End of the main thread");
    }
    public static void main(String[] args) {
        Main main = new Main();
        First first = new First();
        Second second = new Second();

        main.start();
        first.start();
        second.start();

       while(main.isAlive() || first.isAlive() || second.isAlive()){
           continue;
       }
        System.out.println("End of threads work");
    }
}
