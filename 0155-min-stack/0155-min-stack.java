import java.util.Stack;

class MinStack {
    Stack<Integer> s;
    int minele;

    public MinStack() {
        s = new Stack<>();
        minele = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= minele) {
            s.push(minele);
            minele = val;
        }
        s.push(val);
    }

    public void pop() {
        if (s.isEmpty()) return;
        int popped = s.pop();
        if (popped == minele && !s.isEmpty()) {
            minele = s.pop();
        }
    }

    public int top() {
        if (s.isEmpty()) return -1;
        int top = s.peek();
        return top < minele ? minele : top;
    }

    public int getMin() {
        if (s.isEmpty()) return -1;
        return minele;
    }
}