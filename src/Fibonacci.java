import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        //递归方式求出斐波那契数1，1,2，3,5,8
        //给你一个整数求出他的值是多少
        System.out.println("请输入你的值：");
        Scanner myscanner =new Scanner(System.in);
        int a=myscanner.nextInt();
        xx B=new xx();
        int result=B.fibonacci(a);
        System.out.println("输出的值是"+result);
    }
}

class xx{
    public int fibonacci(int A){
        if(A==1||A==2){
            return 1;
        }else{
            return fibonacci(A-2)+fibonacci(A-1);
        }
    }
}