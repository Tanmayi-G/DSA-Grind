package StacksAndQueues;

public class Implement_stack_using_array {
    private int[] stackArray;
    private int n;
    private int top;

    public Implement_stack_using_array(int size) {
        n = size;
        stackArray = new int[n];
        top = -1;
    }

    public void push(int x) {
        if (top >= n - 1) {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stackArray[top] = x;
    }

    public int pop() {
        if (top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped=stackArray[top];
        top--;
        return popped;
    }

    public int top() {
        if (top==-1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size(){
        return top+1;
    }
}
