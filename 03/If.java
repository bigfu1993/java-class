import java.util.Scanner;
public class If{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入if数字");
        int i = myScanner.nextInt();
        if(i>5){
            System.out.println("输入的值大于5");
        }else if (i<2){
            System.out.println("输入的值小于2");
        }else{ 
            System.out.println("输入的值在2-5之间");
        }

        System.out.println("请输入switch数字");
        int s = myScanner.nextInt();
        switch(s){
            case 1:
            System.out.println("输入的值为壹");
            break;
            case 2:
            System.out.println("输入的值为贰");
            break;
            case 3:
            System.out.println("输入的值为叁");
            break;
            default:
            System.out.println("输入的值为其他数");
        }
    }
}