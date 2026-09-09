class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peekFirst()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        int top = stack.pop();
        if (top == getMin()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}
