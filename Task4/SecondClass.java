package Task4;

import Task2.Second;

public class SecondClass extends Thread {
    public String firstField;

    public SecondClass(String firstField){
        this.firstField = firstField;
    }

    @Override
    public synchronized void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(firstField);
                try {
                    sleep(2100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
    }
}
