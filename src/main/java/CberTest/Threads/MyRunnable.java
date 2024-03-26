package CberTest.Threads;

//его отличие в том, что передает в main его через конструктор.
public class MyRunnable implements Runnable{
    Resourse resourse;
    StaticResourse staticResourse;

    @Override
    public void run(){
        System.out.println("Поток запущен: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " - i = " + i);
        }
        resourse.changeI();
        staticResourse.changeI();
    }

    public void setResource(Resourse r ){
        this.resourse = r;
    }
    public void setStaticResourse(StaticResourse r_s ){
        this.staticResourse = r_s;
    }
}
