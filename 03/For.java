public class For {
    public static void main(String[] args){
        // //  1-100 9的倍数有几个分别是什么
        // int count = 0;
        // String s = "";
        // for(int i = 0;i<=100;i++){
        //     if(i>9&&i%9==0){
        //         count+=1;
        //         s=s+i+"、";
        //     }
        // }
        // System.out.println("9的倍数有"+count+"个，分别是："+s);

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