package Lanqiaocup;
import java.util.*;
/* 在很久很久以前，有 n个部落居住在平原上，依次编号为 1 到 n。第i个部落的人数为 t~i~。
   有一年发生了灾荒。年轻的政治家小蓝想要说服所有部落一同应对灾荒，他能通过谈判来说服部落进行联合。
   每次谈判，小蓝只能邀请两个部落参加，花费的金币数量为两个部落的人数之和，谈判的效果是两个部落联合成一个部落（人数为原来两个部落的人数之和）。*/
// 贪心算法，每次选择最小的两个部落花费最小，局部最优解。
public class negotiate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        List<Integer> list= new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
             int x=scan.nextInt();
             list.add(x);// 将部落人数用List集合进行存储，后面进行排序。
        }
        Collections.sort(list);
        while(list.size()>1){
            int a = list.get(0);
            int b = list.get(1);
            sum=sum+a+b;
            //将人数最少的两个部落进行合并，并之后将合并之后的这个部落加入原list，然后再进行排序
            list.remove(0);
            //记住list删除第一个元素之后，下标就会自动前移动。后续的元素会向前移动以填补被删除元素的位置
            list.remove(0);
            //将合并的部落加入进去
            list.add(a+b);
            //再次进行排序
            Collections.sort(list);
        }
        System.out.println(sum);
    }
}
