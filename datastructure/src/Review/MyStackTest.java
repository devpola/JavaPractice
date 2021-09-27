package Review;

public class MyStackTest {

    public static void main(String[] args) {

        MyArrayStack stack = new MyArrayStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.printAll();

        System.out.println(stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.getStackSize());
        System.out.println(stack.pop());
        System.out.println(stack.getStackSize());
        System.out.println(stack.peek());

        MyArrayStack stack2 = new MyArrayStack(5);

    }
}
