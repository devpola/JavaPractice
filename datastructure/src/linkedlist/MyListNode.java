package linkedlist;

public class MyListNode {

   private String data;
   public MyListNode next;  //다음 노드를 가리키는 링크

   public MyListNode() {
       data = null;
       next = null;
   }

   public MyListNode(String data) {
       this.data = data;
       this.next = null;
   }

   public String getData() {
       return data;
   }
}
