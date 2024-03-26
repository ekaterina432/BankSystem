package CberTest.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> listSort  = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        for (int i: listSort){
            System.out.println(i);
        }

    }
}
