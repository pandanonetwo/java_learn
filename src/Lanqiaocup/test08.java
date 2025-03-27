package Lanqiaocup;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class test08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt()+1;
        //定义队列
        Queue<Integer> q = new ArrayDeque<Integer>();
        for(int i=1;i<=n;i++){
          q.add(i);
        }
        int seek =0;
        while(!q.isEmpty()){
 
          int x = q.poll();
          seek++;
          if(seek==k){
            System.out.print(x+" ");
            seek=0;
          }else{
            q.add(x);
  
          }
        }
        scan.close();
    }
}