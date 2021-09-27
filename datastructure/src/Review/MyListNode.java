package Review;

public class MyListNode {

    private String data;
    public MyListNode next;

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public String getElement() {
        return data;
    }
}
