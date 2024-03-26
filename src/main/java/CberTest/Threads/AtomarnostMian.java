package CberTest.Threads;

import java.util.concurrent.atomic.AtomicInteger;

//т.е если функция вызывает много потоков, она не закончится пока не отработает каждая из них
public class AtomarnostMian {
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10000; i++ ){
            new AtomThread().start();
        }

        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }

    static class AtomThread extends  Thread{
        @Override
        public void run(){
            //увеличивает значение переменной на 1
            atomicInteger.incrementAndGet();
        }
    }
}
