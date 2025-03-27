package Lanqiaocup;

import java.util.*;
/*LinkedList 和 ArrayDeque 
 * LinkedList 既可以实现List接口又可以实现Queue接口，但是LindedList底层是用双向链表实现，所以随机访问性能比较差，
 * 推荐使用ArrayDeque类*/
//演示栈和队列的使用
public class test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(100);
        System.out.println("栈大小为："+stack.size());
        while(!stack.isEmpty()){ //栈非空就可以输出
            System.out.println("栈顶元素是："+stack.peek());// peek()方法表示取栈顶元素，不是出栈
            System.out.println(stack.pop());//pop()方法表示出栈
        }
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(100);
        while(!queue.isEmpty()){
            System.out.println("现在队头元素是："+queue.peek());
            System.out.println("出队"+queue.poll());
        }

    }
}