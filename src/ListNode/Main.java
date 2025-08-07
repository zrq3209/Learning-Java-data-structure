package ListNode;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // 插入一些数据
        list.insertAtPosition(0, 1);
        list.insertAtPosition(1, 3);
        list.insertAtPosition(1, 2);

        list.printList();
    }
}