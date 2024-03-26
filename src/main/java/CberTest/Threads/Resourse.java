package CberTest.Threads;

public class Resourse {
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void  setI(int i) {
        this.i = i;
    }

    public synchronized void changeI(){
        int i = this.i;
        i++;
        this.i = i;
    }
}
