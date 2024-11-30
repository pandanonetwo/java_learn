package com.xs.houserent.service;

import com.xs.houserent.HouseRentApp;
import com.xs.houserent.domain.House;

/*
* HouseService.java<=>类 [业务层]
* //定义House[]数组，保存House对象
* 1.响应HouseView的调用
* 2.完成对房屋信息的各种操作（增删改查c（Create）r（read）u（update）d（delete）
* */
public class HouseService {
    private House[] houses;//保存House对象
    private int houseNum = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前id增长到哪个值了
    public HouseService(int size){  //构造器，传入size设置数组
        houses = new House[size];//当创建HouseService对象
        //指定数组大小
        //为了配合测试列表信息，这里初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");

    }
    //find方法，返回一个House对象或者null
    public House findById(int findId){
        for (int i = 0; i < houseNum; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    } 

    //del方法，删除一个房屋信息
    public boolean del(int delId){
        //应当先找到删除的房屋信息对应的下标
        //下标和房屋的编号不是一回事
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                //要删除的房屋（id)是数组下标为i的元素
                index = i;
            }
        }
            if(index == -1){//说明delId在数组中确实不存在
                return false;
            }
            //如果找到，思路分析：把后面的都挪上来
        for (int i = index; i < houseNum-1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;//把当前存在的房屋信息的最后一个置空
        return true;
    }


    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加（暂不考虑数组扩容
        if(houseNum == houses.length){//不能添加了
            System.out.println("数组已满，不能再添加了。。。");
            return false;
        }
        //把newHouse对象加入到数组里面,新增加了一个房屋
        houses[houseNum++]=newHouse;
        //需要设计一个id自增长机制,并且更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }
    //list方法，返回houses
    public House[] list(){  //调用list（）返回的是House[]数组
        return  houses;
    }
}
