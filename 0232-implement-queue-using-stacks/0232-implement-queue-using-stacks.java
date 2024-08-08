class MyQueue {
    private Stack<Integer> first;
    private Stack <Integer> second;

    public MyQueue() {
        first=new Stack<>();
        second=new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);

        // remove method optimized
        // while(!first.isEmpty()){
        //     second.push(first.pop());
        // }
        // first.push(x);
        // while(!second.isEmpty()){
        //     first.push(second.pop());
        // }
    }
    
    public int pop() {
        while(!first.isEmpty()){
        second.push(first.pop());
        }
        int removed =second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;

         // remove method optimized
        // return first.pop();
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked=second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;

         // remove method optimized
        // return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */