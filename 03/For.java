public class For {
    public static void main(String[] args){
        // //  1-100 9�ı����м����ֱ���ʲô
        // int count = 0;
        // String s = "";
        // for(int i = 0;i<=100;i++){
        //     if(i>9&&i%9==0){
        //         count+=1;
        //         s=s+i+"��";
        //     }
        // }
        // System.out.println("9�ı�����"+count+"�����ֱ��ǣ�"+s);

        int line = 4;
        for(int i = 0;i<line;i++){
            for(int k = 0;k<line-i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println('\r');
        }
    }
}