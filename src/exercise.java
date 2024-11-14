import java.util.Scanner;
public class exercise {
    public static void main(String[] args){
        //编写一个类AA，有一个方法：判断奇数或者偶数，返回boolean
        System.out.println("请输入数字");
        Scanner myscanner=new Scanner(System.in);
        int math=myscanner.nextInt();
        AA a=new AA();
        boolean b=a.judge(math);
        System.out.println(b);


    }


}
class AA {
    public boolean judge(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }

    }
}

