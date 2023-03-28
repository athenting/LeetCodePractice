package Solutions.Blind75;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
 */
public class ImplQueueUsingStack {
    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();

    public ImplQueueUsingStack() {

    }

    public void push(int x) {
        //已经push之后，产生了pop或者peek行为，再push进新元素
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        //没有pop或者peek过
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
