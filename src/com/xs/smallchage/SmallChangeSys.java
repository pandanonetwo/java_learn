package com.xs.smallchage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
         boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "-----------零钱通明细--------";

         double money = 0;
         double balance = 0;
         Date date=null; //date 是java.util.Date 类型，表示日期
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do{
             System.out.println("\n============零钱通菜单============");
             System.out.println("\t\t\t1.零钱通明细");
             System.out.println("\t\t\t2.收益入账");
             System.out.println("\t\t\t3.消费情况");
             System.out.println("\t\t\t4.退   出");

             System.out.println("请选择（1-4）：");
             key = scanner.next();
             //使用switch 分支
            switch (key){
                case "1":
                    System.out.println("1.零钱通明细");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("2.收益入账");
                    System.out.println("收益入账金额：");
                    money =scanner.nextDouble();
                    if(money <=0){
                        System.out.println("入账金额需要大于0");
                        break;
                    }
                    balance+=money;
                    date=new Date();


                    //拼接到details
                    details += "\n收益入账\t+" +money+"\t"+sdf.format(date)+"\t"+ balance;

                    break;
                case "3":
                    System.out.println("3.消费");
                    String name="";
                    System.out.println("输入消费项目：");
                    name=scanner.next();
                    System.out.println("输入消费金额：");
                    money =scanner.nextDouble();
                    if(money<=0 || money > balance){
                        System.out.println("你的金额应该在 0-"+balance);
                        break;
                    }
                    balance-=money;
                    date=new Date();


                    //拼接到details
                    details += "\n"+name+"\t-" +money+"\t"+sdf.format(date)+"\t"+ balance;

                    break;
                case "4":
                    String choice = "";
                    while(true){
                        System.out.println("你确定要退出吗：y/n");
                        choice=scanner.next();
                        if("y".equals(choice)||"n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop=false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

         }while(loop);
        System.out.println("退出了零钱通项目~");


    }
}
