public class currentTime {
    public static void main(String [] args){
        long star = System.currentTimeMillis();
        long num = 0;
        for (int i = 1; i <= 800000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间是：" + (end - star));
    }
}
