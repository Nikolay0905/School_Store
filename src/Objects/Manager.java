package Objects;

public class Manager extends Employee {
    public Manager(String name, String egn, short age, int experience, float salary, String education,String restaurantId ) {
        super(name, egn, age, experience, salary, education ,restaurantId);
    }

    public void FireSomeone(String name , String EGN , String reason ) {
        String position = "готвач";
        //TBD
        System.out.println("Мениджър: " + this.getName() + "\n уволнява "+ position + " :" + name + " \n с ЕГН: " + EGN + " \n поради : \n" + reason);
    }

    public void HireSomeone(String name , String EGN, String position){
        //TBD
        System.out.println("Мениджър: " + this.getName() + " назначава " + position + " : " + name + "  с ЕГН: " + EGN);
    }

    public void GetStock(String StockId){
        System.out.println("Взимаме  (id): " + StockId);
        //TBD
    }

    public void WhatCanManagerDo(){
        System.out.print("Fire someone , Hire someone, Get stock : ");
    }
}
