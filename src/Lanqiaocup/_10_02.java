package Lanqiaocup;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改
/*把每个单词的首字母变为大写。
把数字与字母之间用下划线字符（_）分开，使得更清晰
把单词中间有多个空格的调整为 1 个空格。*/
public class _10_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();//next()遇到空格就返回
        char []c=str.toCharArray();//将一个字符串对象中的字符转换为一个字符数组\
        int n=c.length;
        StringBuilder st=new StringBuilder();
        int i=0;
        while(i<n){
            char x=c[i];
            if(x>='a'&&x<='z'){
                if(i==0||c[i-1]==' '){
                    x^=32;//起首字母大写的功能
                }
                st.append(x);
                i++;
            }
            else if(x==' '){
                st.append(x);
                while(c[i]== ' ')i++;//起跳过空格的作用
            }
            else{
                if (i > 0 && c[i-1]>='a'&&c[i-1]<='z'){
                    st.append('_');
                    st.append(x);
                }else if(i+1<n&&c[i+1]>'a'&&c[i+1]<='z'){
                    st.append(x);
                    st.append('_');
                }else{
                    st.append(x);
                }

                i++;
            }
        }
        System.out.println(st);


    }
}