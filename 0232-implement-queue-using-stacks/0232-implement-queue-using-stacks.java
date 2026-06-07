class MyQueue {
    Stack<Integer> instk;
    Stack<Integer> outstk;
    public MyQueue() {
        instk= new Stack<>();
        outstk=new Stack<>();
    }
    
    public void push(int x) {
        instk.push(x);
    }
    
    public int pop() {
        peek();
        return outstk.pop();
    }
    
    public int peek() {
        if(outstk.isEmpty()){
            while(!instk.isEmpty()){
                outstk.push(instk.pop());
            }
        }
        return outstk.peek();
    }
    
    public boolean empty() {
        return instk.isEmpty() && outstk.isEmpty();
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