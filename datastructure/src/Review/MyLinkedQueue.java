package Review;

interface Queue{
    void enQueue(String data);
    String deQueue();
    int getQueueSize();
    void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue{
    MyListNode front;
    MyListNode rear;

    public MyLinkedQueue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode = addElement(data);

        if(isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        else {
            rear = newNode;
        }
    }

    @Override
    public String deQueue() {
        String ret;

        if(isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }

        ret = front.getElement();
        front = front.next;
        if(front == null) {
            rear = null;
        }

        return ret;
    }

    @Override
    public int getQueueSize() {
        return getSize();
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
