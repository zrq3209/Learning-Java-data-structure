package ListNode;

public class ReverseMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.instertAtTail(1);
        list.instertAtTail(2);
        list.instertAtTail(3);
        list.instertAtTail(4);

        System.out.println("��תǰ��");
        list.printList(); // 1 -> 2 -> 3 -> 4 -> null

        list.reverse();

        System.out.println("��ת��");
        list.printList(); // 4 -> 3 -> 2 -> 1 -> null
    }
}
