package linkedlist;

//LinkedList : 선형 자료구조(인접한 데이터간의 관계가 1:1인 자료구조) 중 하나로,
//-동일한 데이터 타입을 순서에 따라 관리하는 자료구조
//-자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크 존재
//-자료가 추가 될 때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        MyListNode tempNode = head;

        if(head == null) {
            head = newNode;
        }
        else {
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        MyListNode newNode = new MyListNode(data);
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position < 0 || position > count) {
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }
        else if(position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            for(int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = tempNode;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position < 0 || position > count) {
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }
        else if(position == 0) {
            head = head.next;
        }
        else {
            for(int i = 0; i < position; i++){
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position + "번째 항목이 삭제되었습니다.");
        return tempNode;
    }

    public String getElement(int position) {
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0) {
            return head.getData();
        }

        for(int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.getData();
    }

    public MyListNode getNode(int position) {
        MyListNode tempNode = head;

        if(position >= count) {
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0) {
            return head;
        }

        for(int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }

        return tempNode;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printAll() {
        if(count == 0) {
            System.out.println("출력할 요소가 없습니다.");
            return;
        }

        MyListNode tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.getData());
            tempNode = tempNode.next;
            if (tempNode != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public void removeAll() {
        head = null;
        count = 0;
    }
}
