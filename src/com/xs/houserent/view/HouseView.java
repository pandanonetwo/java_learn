package com.xs.houserent.view;
/*
* 1.显示界面
* 2.接受用户输入
* 3.调用HouseView完成对房屋信息的各种操作
* */

import com.xs.houserent.domain.House;
import com.xs.houserent.service.HouseService;
import com.xs.houserent.utils.Utility;

public class HouseView {
    private boolean loop=true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(10);
    //上面设置数组大小为10；

    //编写findHouse(),接收输入id
    public void findHouse(){
        System.out.println("===========查找房屋===========");
        System.out.println("请输入要查找的id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if(house !=null){
            System.out.println(house);
        }else{
            System.out.println("===========查找房屋信息id不存在===========");
        }
    }


    //完成退出确认
    public void exit(){
        char choice=Utility.readConfirmSelection();
        if(choice=='Y') {
            loop = false;
        }

    }

    //编写delHouse()接收输入id，调用service的del方法
    public void delHouse(){
        System.out.println("===========删除房屋信息===========");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delID = Utility.readInt();
        if(delID==-1){
            System.out.println("===========放弃删除房屋信息===========");
            return;
        }
        //注意该方法本身就有循环判断的逻辑，必须输入y/n
        char choice = Utility.readConfirmSelection();
        if(choice=='Y'){//真的删除
            if(houseService.del(delID)){
                System.out.println("===========删除房屋信息成功===========");
            }else{
                System.out.println("===========房屋编号不存在，删除失败===========");
            }
        }else{

        }

    }

    //编写addHouse()方法，接受输入，创建House对象，调用add方法
    public void addHouse(){
        System.out.println("===========添加房屋===========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的，用户是不能输入的
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)){
            System.out.println("===========添加房屋成功===========");
        }else{
            System.out.println("===========添加房屋失败===========");
        }
    }
    //编写listHouses()显示房屋列表
    public void listHouses(){
        System.out.println("===========房屋列表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
        House[] houses = houseService.list();//得到所有房屋信息，放到这个数组里面
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]==null){//如为null，就不显示了
            break;
            }
            System.out.println(houses[i]);
            }
        System.out.println("===========房屋列表显示完毕===========");
    }
    //显示主菜单
    public void mainMenu(){

        do{
            System.out.println("===========房屋出租系统菜单===========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key){
                case '1' :
                    addHouse();
                    break;
                case '2' :
                    findHouse();
                    break;
                case '3' :
                    delHouse();
                    break;
                case '4' :
                    System.out.println("修 改");
                    break;
                case '5' :
                    listHouses();

                    break;
                case '6' :
                    exit();
                    break;

            }
        }while(loop);
    }
}
