package CberTest.Threads;

public class MainThreads {
    public static void main(String[] args) throws InterruptedException {
        Resourse r = new Resourse();
        r.setI(3);
        StaticResourse r_s = new StaticResourse();
        r_s.i = 8;
        //потоки
        MyThread myThread = new MyThread();
        //поток создаются только при start
        myThread.start();
        myThread.setResource(r);
        myThread.setStaticResourse(r_s);
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        // приоритет от 1 до 10
        thread2.start();
        thread2.setPriority(7);
        myRunnable.setResource(r);
        myRunnable.setStaticResourse(r_s);
        //устанавливает время выполнения потоков и разрешает другому потоку выполнение,
        // если он уже был выполнен. Вызывается только на текущем потоке.
        MyThread.yield();
        //разрешает выполнение других потоков строго когда закончит свою работу
        // thread2.join();
        //поток main запустился через 1 секунду
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println(r.getI());
        System.out.println(r_s.i);




    }
}
