package Task6;

public class SecondThreadDL extends Thread {
    Thread t1;

    public SecondThreadDL(){
        System.out.println("Second thread");
    }

    public void setThread(Thread t){
        this.t1 = t;
    }

    @Override
    public void run(){
        System.out.println("Start of second thread");
        synchronized (this){
            System.out.println("Hold Second Thread");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (t1){
            System.out.println("End of Second Thread");
        }
    }
}
