package Task4;

public class FirstClass extends Thread{
    public String firstField;
    public int secondField;
    boolean flag;

    public FirstClass(String firstField, int secondField){
        this.firstField = firstField;
        this.secondField = secondField;
    }

    @Override
    public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(firstField);
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
    }
}
