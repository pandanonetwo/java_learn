package Lanqiaocup;
import java.util.*;
/* 给定一个数组，其采用如下代码定义：
int data[200];
for(i = 0 ; i < 200 ; i ++）data[i] = 4 * i + 6;
输入一个待查找的整数（该整数一定在数组 data 中）。输出该整数在数组中的指标。*/
public class test05 {
    public static void main(String[] args) {
        int []data = new int [200];
        for (int i = 0; i < 200; i++) {
            data[i] = 4*i+6;
        }
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        //采用二分法进行查询。数组下标从0-199
        int l=0,r=199;
        while(l<=r){//区间包含边界，所以设置为小于包含等于。
            int mid=(l+r)/2;
            if(data[mid]>x){
                r=mid-1;
            }else if(data[mid]<x){
                l=mid+1;
            }else {

                System.out.println(mid);
                break;

            }
        }


    }
}
