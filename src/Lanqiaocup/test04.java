package Lanqiaocup;
import java.util.*;
public class test04 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int S = scan.nextInt();
            int min=n+1 ;//
            long sum = 0;
            int []a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=scan.nextInt();//录入数组a
            }
            int l=0,r=0;//左右指针都指向第一个元素。
            while(r<=n-1){ //当右指针右移到超出数组边界循环结束。
                sum+=a[r];
                while(sum>=S){ //大于S的时候移动左指针
                    min=Math.min(min,r-l+1);//每次比较肯定要与之前的min进行比较啊，原来错在这里
                    sum-=a[l];
                    l++;
                }
                r++;
            }
            //若不存在任何美丽的区间，则输出0;
            if(min==n+1){
                min=0;
            }
            System.out.println(min);

        }
    }