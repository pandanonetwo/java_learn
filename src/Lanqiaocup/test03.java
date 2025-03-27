package Lanqiaocup;
import java.util.*;
public class test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char []a = scan.next().toCharArray();
        int l=0;//定义左指针
        int r=a.length-1;//数组的长度是一个属性而不是方法
        while(l<=r){
            if(a[l]!=a[r]){
                System.out.println("N");
                break;
            }
            l++;
            r--;
        }
        if(l>r) {
            System.out.println("Y");
        }

    }
}
