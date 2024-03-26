package CberTest.Threads;

public class MyThread extends  Thread{
    Resourse resourse;
    StaticResourse staticResourse;

    //для того, чтобы запустить поток нужно переопределить run и оно будет вызваться вместо main/
    @Override
    public void run(){
        for (int i = 0; i < 20; i++){
            System.out.println(Thread.currentThread().getName() + " : i = " + i);
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
