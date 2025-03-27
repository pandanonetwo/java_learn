package Lanqiaocup;

public class transformer {
    public static String con(int x,int n){
        StringBuilder str1=new StringBuilder();
        while(x>0) {
            str1.append(x%n);//取得每一位的值
            x/=n;
        }
        return str1.reverse().toString();//返回反转字符串
    }
public static void main(String args[]){
        System.out.println(con(16,2));
    }
}
