class MinStack {
    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minStack.push(val);
        } else {
            minStack.push(Math.min(minStack.peekFirst(), val));
            stack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minStack.getFirst();
    }
}
