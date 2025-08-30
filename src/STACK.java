class Stack {
    private int MAX_SIZE;
    private int[] stack;
    private int top;
    public Stack(int size) {
        MAX_SIZE = size;
        stack = new int[MAX_SIZE];
        top = -1;
    }
    public boolean isFull(){
        return top == MAX_SIZE-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int data) {
        if(isFull()){
            System.out.println("Stack is full.");
        }
        else{
            stack[++top] = data;
        }
    }
    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty.");
        }
        else{
            System.out.println("\n"+stack[top]);
            stack[top--] = 0;

        }
    }
    public void display() {
        if(top == -1){
            System.out.println("Stack is empty.");
        }
        for(int i = top; i>=0; i--){
            System.out.print(stack[i]+"/"+i + " ");
        }
    }
}

