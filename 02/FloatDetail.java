public class FloatDetail{
    public static void main(String[] args){
        // 浮点型常量默认为double型，声明float常量需要加f | F
        // float n1 = 1.1; // 错误  1.1=8字节 n1=4字节
        float n2 = 1.1f; // 正确 1.1f=4字节 n2=4字节
        double n3 = 1.1; // 正确 1.1=8字节 n3=8字节
        double n4 = 1.1F; // 正确 1.1F=4字节 n4=8字节

        // 浮点常量表示形式
        // 十进制：0.12 .12 5.12 5.12f 
        // 科学计数法：5.12e2=5.12*10^2  5.12E-2=5.12/10^2
        double n5 = 5.12e2;
        double n6 = 5.12E-2;
        System.out.println(n5);
        System.out.println(n6);

        // 浮点数陷进
        // 注意对运算结果是小数的进行判断，要注意
        double n7 = 2.7;
        double n8 = 8.1 /3; // 一个接近2.7的小数
        System.out.println(n7);
        System.out.println(n8);

    }
}