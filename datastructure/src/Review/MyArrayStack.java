package Review;

interface Stack {
    void push(int data);
    int pop();
    int peek();
    int getStackSize();
}

public class MyArrayStack extends MyArray implements Stack{

    private int top;
    public int STACK_SIZE;

    public MyArrayStack() {
        STACK_SIZE = 10;
        top = 0;
    }

    public MyArrayStack(int size) {
        super(size);
        STACK_SIZE = size;
        top = 0;
    }

    @Override
    public void push(int data) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        addElement(data);
        top++;
    }

    @Override
    public int pop() {
        int ret = MyArray.ERROR_NUM;
        if(isEmpty()) {
            System.out.println("stack is empty");
            return ret;
        }
        return removeElement(--top);
    }

    @Override
    public int peek() {
        int ret = MyArray.ERROR_NUM;
        if(isEmpty()) {
            System.out.println("stack is empty");
            return ret;
        }
        return removeElement(top-1);
    }

    @Override
    public int getStackSize() {
        return top;
    }

    public boolean isEmpty() {
        if(top == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull() {
        if(top == STACK_SIZE) {
            return true;
        }
        else {
            return false;
        }
    }
}
