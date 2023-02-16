package Task5;

public class FirstThread extends Thread{
    Thread t2;

    public FirstThread() {
        System.out.println("First thread");
    }

    public void setThread (Thread t){
        this.t2 = t;
    }

    @Override
    public void run(){
        System.out.println("Start of first thread");
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("First thread is finished");
    }
}
