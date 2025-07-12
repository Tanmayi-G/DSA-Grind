package StacksAndQueues;

public class Implement_queue_using_array {
    int[] arr;
    int start, end;
    int currSize, n;

    public Implement_queue_using_array() {
        arr = new int[10];
        start = -1;
        end = -1;
        currSize = 0;
        n = 10;
    }

    public void push(int x) {
        if (currSize == n) {
            System.out.println("Queue is full");
            System.exit(1);
        }

        if (currSize == 0) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % n;
        }
        arr[end] = x;
        currSize++;
    }

    public int pop() {
        if (currSize == 0) {
            System.out.println("Queue Empty");
            System.exit(1);
        }

        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % n;
        }
        currSize--;
        return popped;
    }

    public int peek() {
        if (currSize==0) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }

    public boolean isEmpty() {
        return currSize == 0;
    }
}
