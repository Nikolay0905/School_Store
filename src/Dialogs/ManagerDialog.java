package Dialogs;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import Objects.Manager;

public class ManagerDialog {

    public static void initManager(Manager manager){
        Scanner scanner = new Scanner(System.in);
        //TBD for shop and data from base
        System.out.println("Списък с работници");
        System.out.println("--------------------------------");
        System.out.println(" Чистач | Готвач | Продавач ");
        System.out.println("--------------------------------");
        System.out.println("  Иван  |  Петър |  Мърката ");
        System.out.println("  Иван  |  Петър |  Мърката ");
        System.out.println("  Иван  |  Петър |  Мърката ");
        System.out.print("Изберете 1 - работници или 2 - възможности ");
        manager.WhatCanManagerDo();
        //TBD make check if this user and role are
        short userChoise = scanner.nextShort();

        if(userChoise == 1){

//            while(isValid(userChoise)){
//            System.out.println("Името: " + nameAndRole[0]  + " с роля: "  + nameAndRole[1] + "не съвпадат!");
//            System.out.print("Изберете работник и роля : (Иван-Продавач)");
//            nameAndRole = scanner.nextLine().split("-");
//        }
        }else{
            System.out.println("Изберете: 1-За назначаване / 2-Уволняване / 3-Вземане на стока");
            userChoise = scanner.nextShort();
            while(userChoise != 0){
                switch (userChoise) {
                    case 1 -> {
                        hireNewWorker(manager);
                        userChoise = getNewChoice();
                    }
                    case 2 -> {
                        fireWorker(manager);
                        userChoise = getNewChoice();
                    }
                    case 3 -> {
//                        System.out.println("Въведете номера на стоката ,която искате да заредите : ");
                        //TBD : print stocks with number to choose
                        System.out.println("Вземане на стока...");
                        userChoise = getNewChoice();
                    }
                    default -> {
                        System.out.println("Направили сте невалиден избор , опитайте отново !");
                        System.out.println("Изберете: 1-За назначаване / 2-Уволняване / 3-Вземане на стока");
                        userChoise = scanner.nextShort();
                    }
                }
            }
        }
    }
    private static short getNewChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Искате ли да направите още нещо ? Изберете 1-За назначаване / 2-Уволняване / 3-Вземане на стока ? (Ако не ,напишете : 0) : ");
        return scanner.nextShort();
    }
    private static void hireNewWorker (Manager manager) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете името на човека ,когото ще наемате: ");
        String newWorkerName = scanner.nextLine();
        System.out.print("Въведете единния му граждански номер (ЕГН): ");
        String newWorkerEGN = scanner.nextLine();
        System.out.print("Въведете позиция на която го наемате : (Чистач , Продавач , Готвач) : ");
        String newWorkerPosition = scanner.nextLine();
        while(!newWorkerPosition.equalsIgnoreCase("продавач") || !newWorkerPosition.equalsIgnoreCase("чистач") || !newWorkerPosition.equalsIgnoreCase("готвач")){
            System.out.print("Моля въведете правилно позицията ,на която искате да наемете "+ newWorkerName + " (Чистач , Продавач , Готвач) : ");
            newWorkerPosition = scanner.nextLine();
        }
        manager.HireSomeone(newWorkerName, newWorkerEGN,newWorkerPosition);
    }
    private static void fireWorker(Manager manager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кого искате да уволните ? : ");
        String firedWorkerName = scanner.nextLine();
        System.out.println("ЕГН на уволнения : ");
        String firedWorkerEGN = scanner.nextLine();
        System.out.println("Защо искате да го уволните ? : ");
        String reasonForFiring = scanner.nextLine();
        manager.FireSomeone(firedWorkerName, firedWorkerEGN, reasonForFiring);
    }
    private static boolean isValid(String nameAndRole){
        boolean isValid = false;

        //check

        return false;
    }

}
