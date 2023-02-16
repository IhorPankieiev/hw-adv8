package Task5;

public class SecondThread extends Thread {
    Thread t1;

    public SecondThread(){
        System.out.println("Second thread");
    }

    public void setThread(Thread t){
        this.t1 = t;
    }

    @Override
    public void run(){
        System.out.println("Start of Second Thread");
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second thread is finished");
    }
}
