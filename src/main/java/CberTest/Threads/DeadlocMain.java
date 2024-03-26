package CberTest.Threads;

public class DeadlocMain {
    public static void main(String[] args) throws Exception {
        ResourseA resourseA = new ResourseA();
        ResourseB resourseB = new ResourseB();
        resourseB.resourseA = resourseA;
        resourseA.resourseB = resourseB;
        DeadThread1 deadThread1 = new DeadThread1();
        DeadThread2 deadThread2 = new DeadThread2();
        deadThread1.resourseA = resourseA;
        deadThread2.resourseB = resourseB;
        deadThread1.start();
        deadThread2.start();

    }

    static class DeadThread1 extends Thread{
        ResourseA resourseA;
        @Override
        public void run() {
            System.out.println(resourseA.getI());
        }
    }

    static class DeadThread2 extends Thread{
        ResourseB resourseB;
        @Override
        public void run() {
            System.out.println(resourseB.getI());
        }
    }


    static class ResourseA{
        ResourseB resourseB;
        public synchronized int getI(){
            return resourseB.returnI();
        }

        public synchronized  int returnI(){
            return  1;
        }
    }

    static class ResourseB{
        ResourseA resourseA;
        public synchronized int getI(){
            return resourseA.returnI();
        }

        public synchronized  int returnI(){
            return  1;
        }
    }
}
