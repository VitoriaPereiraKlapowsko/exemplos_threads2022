package ifpr.pgua.eic.threadsjavafx.Cmd;

public class Ex01 implements Runnable{
    
    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sou a thread "+Thread.currentThread().getName());
        }
    }
}
