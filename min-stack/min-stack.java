class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack();
    Stack <Integer> minval = new Stack();
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(minval.isEmpty() || x <=minval.peek()){
            minval.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(minval.peek())){
            minval.pop();
        }
        
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minval.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */