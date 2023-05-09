package com.hspedu.project;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        do {
            System.out.println("======= 零钱通菜单 =======");
            System.out.println("1 零钱通明细");
            System.out.println("2 收益入账");
            System.out.println("3 消费");
            System.out.println("4 exit");
            System.out.print("请选择菜单(1-4)：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println("零钱通明细");
                    System.out.println("------- 明 细 -------");
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("请输入收益入账：");
                    money = scanner.nextDouble();
                    System.out.println("入账金额：¥" + money);
                    balance += money;
                    date = new Date();
                    details += "入账\t+¥" + money + "\t" + sdf.format(new Date()) + "\t余额" + balance + "\n";
                    break;
                case "3":
                    System.out.println("3 消费");
                    break;
                case "4":
                    System.out.println("4 exit");
                    loop = false;
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }
        } while (loop);
    }
}
