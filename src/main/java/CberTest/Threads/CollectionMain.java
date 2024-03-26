package CberTest.Threads;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionMain {
    // Т.е. у этого листа все методы засинхронизированы
    List list = Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) {
    NameList nameList = new NameList();
    nameList.add("первый");
      class ColThread extends Thread{
            @Override
            public void run(){
                System.out.println(nameList.removeFirst());
            }
      }
      new ColThread().start();
      new ColThread().start();


    }
    static class NameList{
        private List list = Collections.synchronizedList(new ArrayList<>());
        public  void  add(String name){
            list.add(name);
        }

        //synchronized нужен чтобы при случае если пока один поток зайдет и не отработает и в
        // это время зайдет еще один поток, может быть ошибка если данная ситуация будет не атомарной
        public synchronized String removeFirst(){
            if (list.size() > 0){
                return (String)list.remove(0);
            }
            else {
                return null;
            }
        }
    }
}
