import java.util.Scanner;

public class Constructor {
    public static void main(String args[]){
        //当我们new一个对象时，直接通过构造器指定姓名和年龄；
        Person p1=new Person("xiashun",80);
        System.out.println("p1信息如下");
        System.out.println("p1姓名是"+p1.name+"\n"+"p1年龄是"+p1.age);

        }
    }

class Person{
    String name;
    int age;
    //下面是构造器
    //1.构造器没有返回值也不能写void
    //2.构造器名称必须和类一直
    //3。（String PName, int PAge)是构造器形参列表，规则
    //和成员方法一样。
//    public Person(String PName,int PAge){
//        System .out.println("构造器被调用~~完成对象属性初始化");
//        name=PName;
//        age=PAge;
//    }
    //引出this构造器之后
        public Person(String name,int age){
        System .out.println("构造器被调用~~完成对象属性初始化");
        this.name=name;//this.name变成当前对象的属性，name还是局部变量
        this.age=age;
    }
}