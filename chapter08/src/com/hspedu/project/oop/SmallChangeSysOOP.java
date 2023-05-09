package com.hspedu.project.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;

    String key = "";
    String details = "";
    String note = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu() {
        do {
            this.detail();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }
        } while (loop);
    }

    public void detail() {
        System.out.println("零钱通明细");
        System.out.println("------- 明 细 -------");
        System.out.println(details);

    }

    public void income() {
        System.out.print("请输入收益入账：");
        money = scanner.nextDouble();
        if (money < 0) {
            System.out.println("收益金额必须大于0！");
            return;
        }
        System.out.println("入账金额：¥" + money);
        balance += money;
        date = new Date();
        details += "入账\t+¥" + money + "\t" + sdf.format(new Date()) + "\t余额" + balance + "\n";
    }

    public void pay() {
        System.out.print("请输入消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额必须¥0-" + balance);
            return;
        }
        System.out.print("请输入消费说明：");
        note = scanner.next();
        balance -= money;
        details += note + "\t-¥" + money + "\t" + sdf.format(new Date()) + "\t余额" + balance + "\n";
    }

    public void exit() {
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
    }
}
