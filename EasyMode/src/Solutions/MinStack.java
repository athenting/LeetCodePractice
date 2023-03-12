package Solutions;

import java.util.Stack;

class MinStack {

    /**
     * initialize your data structure here.
     */
    Stack<Integer> s;
    Stack<Integer> minS;

    public MinStack() {
        s = new Stack<>();
        minS = new Stack<>();
        minS.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        s.push(x);
        minS.push((x <= minS.peek()) ? x : minS.peek());
    }

    public void pop() {
        s.pop();
        minS.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return minS.peek();
    }
}