import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {
//        int[] arr = {1,-1,10,-20,100};
//        Arrays.sort(arr);
//        for (int i = 0; i <arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//
//        int [] nums = {1,2,3,4,5,6};
//        //普通for循环
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("=========增强for循环===========");
//        //执行流程是，依次从nums数组中取出数据，赋给i，
//        // 如果取出完毕，则退出for循环
//        for(int i:nums){
//            System.out.println(i);
//        }

  new A().f1();
    }
}
class A {
    private  String name= "clj";
    public  void f1(){
        class B{
            private  final String NAME="xs";
            public void show(){
                System.out.println("NAME=" + NAME +
                        ",name="+A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
