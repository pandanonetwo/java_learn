package Lanqiaocup;

/*
请你找到最小的整数X
X同时满足：
X是2019 的整倍数；
X 的每一位数字都是奇数。
*/
public class _10_01 {
public static void main(String[] args){
    int x;
    int a=1;
    boolean t= true;
    while(t) {
        x = a * 2019;
        //不断用余数除以10便可以判断奇偶性；
        boolean y = false;
        while (x > 0) {

            int digit = x % 10;
            if (digit % 2 == 0) {
                //偶数
                y = true;
                break;
            }
            x = x / 10;
        }
        t = y;
        a++;
    }
    System.out.println((a-1));


}
}
