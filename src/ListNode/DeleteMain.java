package ListNode;

public class DeleteMain {
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.instertAtTail(1);
        list.instertAtTail(2);
        list.instertAtTail(3);
        list.instertAtTail(4);
        list.instertAtTail(5);

        System.out.println("初始链表：");
        list.printList();

        list.deleteAtPosition(2);

        System.out.println("删除索引为2的节点后：");
        list.printList();
    }
}
