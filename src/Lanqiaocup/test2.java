package Lanqiaocup;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(134);
        list.add(188);
        list.add(85);
        list.add(4);
        list.add(24);
        list.add(16);
        Collections.sort(list);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
