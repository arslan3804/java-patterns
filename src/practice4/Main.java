package practice4;

import java.util.concurrent.ExecutorService;


public class Main {
    public static void main(String[] args){
        ExecutorService executorService = new MyExecutorService(2);
        for (int i=0;i<5;i++){
            executorService.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("We run it");
            });
        }
        executorService.shutdown();

    }
}
