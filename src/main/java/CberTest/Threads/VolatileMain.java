package CberTest.Threads;

public class VolatileMain {
    volatile static int i;

    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();

    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("инкремментировать i до  " + (++i));
                try {
                    Thread.sleep(1000);

                }
                catch (InterruptedException e ){
                    e.printStackTrace();
                }

            }
        }
    }

    // то есть благодаря volatile будет использоваться глабальная переменная и не будет кешироваться
    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("Сейчас значение i равно " + i);
                    localVar = i;
                }
            }

        }
    }
}
