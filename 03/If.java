import java.util.Scanner;
public class If{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������if����");
        int i = myScanner.nextInt();
        if(i>5){
            System.out.println("�����ֵ����5");
        }else if (i<2){
            System.out.println("�����ֵС��2");
        }else{ 
            System.out.println("�����ֵ��2-5֮��");
        }

        System.out.println("������switch����");
        int s = myScanner.nextInt();
        switch(s){
            case 1:
            System.out.println("�����ֵΪҼ");
            break;
            case 2:
            System.out.println("�����ֵΪ��");
            break;
            case 3:
            System.out.println("�����ֵΪ��");
            break;
            default:
            System.out.println("�����ֵΪ������");
        }
    }
}