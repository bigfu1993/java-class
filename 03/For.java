public class For {
    public static void main(String[] args){
        //  1-100 9�ı����м����ֱ���ʲô
        int count = 0;
        String s = "";

        for(int i = 0;i<=100;i++){
            if(i>9&&i%9==0){
                count+=1;
                s=s+i+"��";
            }
        }

        System.out.println("9�ı�����"+count+"�����ֱ��ǣ�"+s);
    }
}