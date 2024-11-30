package com.xs.houserent;

import com.xs.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，使整个程序的入口
        new HouseView().mainMenu();
        //上面不用接受类名，用匿名对象就可以。
        System.out.println("===你退出了房屋出租系统===");
    }
}
