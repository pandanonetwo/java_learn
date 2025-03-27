package Lanqiaocup;

import java.util.*;

public class test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt(); // 录入数组元素
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int x : a) {
            set.add(x); // 用集合看看元素个数
        }
        int total = set.size();//total表示所有元素种类个数

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int l = 0, r = 0;
        int min = n + 1; // 最短长度

        while (r < n) { // 右指针出界时循环结束
            // 扩展右边界
            //判断a[r]这个键是否存在map中,get()方法会返回key所对应的value值，没有就返回null
            if(map.get(a[r])==null){
                map.put(a[r],1);
            }else{//a[r]存在map中，则value+1；
                map.put(a[r],map.get(a[r])+1);
            }
            r++;

            // 收缩左边界
            while (map.size() == total) {//此时窗口内包含所有元素了
                if (r - l < min) {
                    min = r - l;
                }
                map.put(a[l], map.get(a[l]) - 1);
                if (map.get(a[l]) == 0) {//
                    map.remove(a[l]);
                }
                l++;
            }
        }

        System.out.println("最短的蓝桥序列长度为: " + min);
        scan.close();
    }
}