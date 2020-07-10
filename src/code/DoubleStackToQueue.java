package code;

import java.util.Stack;

/**
 * @author: Kahen
 * @time: 2020/7/10 21:42
 * ⽤两个栈来实现⼀个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class DoubleStackToQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public int pop(int node) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is Empty!");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void push(int node) {
        stack1.push(node);
    }
}
