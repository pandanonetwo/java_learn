//一个源文件中最多有一个public类，其他类个数不限
//编译之后，每一个类都对应一个class文件
import java.util.Scanner;
public class Hello {
    public static void main(String args[] ){//程序入口固定格式

//        switch('a') {
//            case 94 :
//                System.out.println("我");
//            case 97 :
//                System.out.println("不");
//                break;
//            case 96 :
//                System.out.println("只");
//                break;
//            case 95 :
//                System.out.println("是");
//            default:
//                System.out.println("懂");
//        }
//        //不加break就不会跳出
//        //for循环
//        for(int i=1;i<=10;i++){
//            System.out.println("你好啊，贵州大学");
//        }
//        //等效于下面的代码
//        int i=1;
//        for(;i<10;){
//            System.out.println("hello,贵州大学");
//            i++;
//        }
//        //无限循环
//        for(;;){
//            System.out.println("无休止");
//        }
//        //for练习题
//        //打印1~100之间9的倍数。统计个数以及总和
//        int num=0;int sum=0;
//        for(int i=1;i<=100;i++){
//            if(i%9==0){
//               System.out.println(i);
//               num+=1;
//               sum+=i;
//            }
//        }
//        System.out.println("个数为："+num+"，总和是"+sum);
//// 题目：随机生成1-100的一个数，知道生成了97这个数，看看用了几次
//         int i=-1,sum=0;
//         do{
//          i=(int)(Math.random()*99)+1;
//          System.out.println(i);
//          sum++;
//         }while (i!=97);
//         System.out.println(sum);
////1-100以内的数求和，求出 当和第一次大于20的当前数字【for+break]
//        int sum=0,i=1;
//        for(;i<=100;i++){
//            sum+=i;
//            if(sum>20){
//                break;
//            }
//        }
//        System.out.println(i);
//
////实现登录验证，有3次机会，如果用户名为“丁真“，密码”666"
////提示登录成功，否则提示还有几次机会，请使用for+break完成
//        Scanner myscanner=new Scanner(System.in);
//        for(int i=3;i>=1;i--){
//            System.out.print("请输入用户名: ");
//            String name=myscanner.nextLine();
//            System.out.print("请输入密码: ");
//            int password=myscanner.nextInt();
//            myscanner.nextLine();
//            if(name.equals("丁真")&&password==666){
//                System.out.println("你好，欢迎光临");
//              break;
//            }else{
//                if(i>1){
//                System.out.println("你还有"+(i-1)+"次机会");
//
//            }else{
//                    System.out.println("机会用完，登录失败！");
//                }
//                }
//
//        }

}
}


//可以将main方法写在非public类，然后指定运行非public类，
//这样入口方法就是非public的main方法
//javac Hello.java
//java Dog就能够运行
//class Dog{
//    public static void main(String args[]){
//        System.out.println("hello.dog");
//    }
//        }
