public class HaniTower {
    public static void main(String args[]){
        Tower tower=new Tower();
        tower.move(10,'A','B','C');

    }
}
class Tower{
    // num表示需要移动的盘数，a,b,c表示三个塔的代号
    //表示借助于中间的b，将a移动到c
    public void move(int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘子，可以看成最下面和上面的所有盘（num-1)
            //(1)先借助于c将上面所有盘移动到b
           move(num-1,a,c,b);
            //(2)再把下面那个盘子移动到c
           System.out.println(a+"->"+c);
            //(3)先借助于a将b塔上面所有盘移动到c
           move(num-1,b,a,c);
        }

    }
}