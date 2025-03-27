package Lanqiaocup;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
//前缀和
public class test {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        int []array=new int[n];
        for(int i=0;i<n;i++){//将输入的数字放进两个数组里面
            a[i]=scan.nextInt();
            array[i]=a[i];
        }
        //将a数组进行排序
        Arrays.sort(a);
        //利用set集合去重
        Set<Integer> set=new HashSet<Integer>();
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        //将排序后数组放进set集合,以set集合每次大小就能判断去重之后的顺序
        for(int i=0;i<n;i++){//将输入的数字放进两个数组里面
            set.add(a[i]);
            map.put(a[i],set.size());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(map.get(array[i])+" ");
        }

    }

}
