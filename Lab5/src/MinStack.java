import java.util.Stack;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int a) {
        stack.push(a);
        if (minStack.isEmpty() || minStack.peek() > a) {
            minStack.push(a);
        }
    }

    int pop() {
        int value = stack.peek();
        if (!minStack.isEmpty() && minStack.peek() == value) {
            minStack.pop();
        }
        return stack.pop();
    }

    int peek() {
        return stack.peek();
    }

    int min() {
        int min = minStack.peek();
        System.out.println("min: " + min);
        return min;
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }

    void print() {
        System.out.println(stack.toString());
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.min();
        stack.push(-1);
        stack.min();
        stack.pop();
        stack.pop();
        stack.min();
        stack.peek();
        stack.print();
    }
}