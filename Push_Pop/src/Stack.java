/*
Lesson: We created an interface with private members and public methods for the user to use at will
 */

class Stack {

    final int SIZE = 10;
    private int[] array;
    private int top;

    //constructor for array
    Stack() {
        array = new int[SIZE];
        top = -1;
    }

    //public methods
    public void push(int value) {
        if (top < SIZE - 1) {
            top++;
            array[top] = value;
    }
        else
                System.out.println("Stack is full");
    }

    public int pop() {
        if(!empty()) {
            top--;
            return array[top + 1];

        }
        else
            System.out.println("Stack is empty");
            return -1;
    }

    public boolean empty() {
        if(top == -1)
            return true;
        else
            return false;
        /*easier way
        return top = -1;
         */

    }
}
