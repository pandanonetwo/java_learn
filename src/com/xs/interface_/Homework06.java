package com.xs.interface_;

import com.xs.houserent.domain.House;

public class Homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.pssRiver();
    }
}

 interface Vehicles {
    public void work();
}


class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下，使用马儿前进。。。");
    }
}

class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河的时候，使用小船。。。");
    }
}

class VehiclesFactory{
    //做成static方法，无法new即可调用
    public static Horse getHorse(){
        return new Horse();
    }
    public static Boat getBoat(){
        return new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void pssRiver(){
        Boat boat = VehiclesFactory.getBoat();
        boat.work();
    }
    public void common(){
        Horse horse = VehiclesFactory.getHorse();
        horse.work();
    }
}