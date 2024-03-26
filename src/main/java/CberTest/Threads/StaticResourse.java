package CberTest.Threads;

public class StaticResourse {
   public static int  i;

    public synchronized void changeI(){
        int i = StaticResourse.i;
        i++;
        StaticResourse.i = i;
    }
}
