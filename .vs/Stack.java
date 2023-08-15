// Stack implementation in Java

class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Creating a stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(23);
        stack.push(25);
        stack.push(19);
        stack.push(28);
        stack.pop();
        stack.pop();
        stack.push(12);
        stack.push(14);
        stack.pop();
        stack.pop();
        stack.push(10);
        stack.pop();
        stack.push(7);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.push(19);
        stack.pop();
        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }
}