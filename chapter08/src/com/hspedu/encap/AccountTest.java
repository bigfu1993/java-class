package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account bigfu = new Account("bigfu", 40, "bigfu0");
        bigfu.info();
    }
}

class Account{
    String name;
    private double money;
    private String password;

    public Account(String name, double money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
        System.out.println("账户创建成功");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=4){
            this.name = name;
        }else{
            System.out.println("用户名不合法，初始用户名为：admin");
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money>20){
            this.money = money;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()==6){
            this.password = password;
        }else{
            System.out.println("密码长度不合法，默认为：000000");
            this.password = "000000";
        }
    }
    public void info(){
        System.out.println("当前用户信息为");
        System.out.println("name:"+this.name);
        System.out.println("money:"+this.money);
        System.out.println("password:"+this.password);
    }
}
