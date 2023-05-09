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
        String note = "";
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
                    if (money < 0) {
                        System.out.println("收益金额必须大于0！");
                        break;
                    }
                    System.out.println("入账金额：¥" + money);
                    balance += money;
                    date = new Date();
                    details += "入账\t+¥" + money + "\t" + sdf.format(new Date()) + "\t余额" + balance + "\n";
                    break;
                case "3":
                    System.out.print("请输入消费金额：");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额必须小于0！");
                        break;
                    }
                    System.out.print("请输入消费说明：");
                    note = scanner.next();
                    balance -= money;
                    details += note + "\t-¥" + money + "\t" + sdf.format(new Date()) + "\t余额" + balance + "\n";
                    break;
                case "4":
                    String choice = "";
                    System.out.println("4 exit");
                    while (true) {
                        System.out.println("你确定退出么y/n？");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                        System.out.println("*** 退出成功 ****");
                    }
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }
        } while (loop);
    }
}
