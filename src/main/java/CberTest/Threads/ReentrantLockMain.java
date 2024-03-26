package CberTest.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {
    public static void main(String[] args) throws InterruptedException {
        RecorseLoc r = new RecorseLoc();
        r.i = 3;
        r.j = 5;
        ThreadLoc myThread1 = new ThreadLoc();
        ThreadLoc myThread2 = new ThreadLoc();
        myThread1.resourseLoc = r;
        myThread2.resourseLoc = r;
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(r.i +"   "+ r.j);



    }

    static class ThreadLoc extends Thread{
        RecorseLoc resourseLoc;
        @Override
        public void run(){
            resourseLoc.changeI();
            resourseLoc.changeJ();

        }
    }

    static public class RecorseLoc {
        private int i;
        private  int j;

        Lock lock = new ReentrantLock();

         void changeI(){
            lock.lock();
            int i = this.i;
            i++;
            this.i = i;
        }

        void changeJ(){
            int j = this.j;
            j++;
            this.j = j;
            lock.unlock();
        }
    }


}
