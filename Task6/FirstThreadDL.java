package Task6;

public class FirstThreadDL extends Thread{
    Thread t2;

    public FirstThreadDL() {
        System.out.println("First thread");
    }

    public void setThread (Thread t){
        this.t2 = t;
    }

    @Override
    public void run(){
        System.out.println("Start of first thread");
        synchronized (this){
            System.out.println("Hold First Thread");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (t2){
            System.out.println("End of First Thread");
        }
    }
}
