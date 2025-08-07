package ListNode;

// 单项链表类
public class SinglyLinkedList {
    private ListNode head; // 链表的第一个节点

    public SinglyLinkedList(){
        head =null; // 链表一开始为空
    }



    public void insertAtPosition(int index,int val){
        // 创建新节点
        ListNode newNode = new ListNode(val);

        // 插入在第0个位置（头部）
        if(index == 0){
            newNode.next = head;
            head =newNode;
            return;
        }
        // 找到插入节点的前一个节点
        ListNode current = head;
        for (int i= 0;i< index-1; i++){
            if (current == null){
                System.out.println("插入位置不合法");
                return;
            }
            current = current.next;
        }

        // 插入节点
        newNode.next = current.next;
        current.next = newNode;

    }

    public void printList(){
        ListNode current = head;
        while (current != null){
            System.out.println(current.val+"->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void instertAtTail(int val){
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head =  newNode;
            return;
        }
        ListNode current =head;
        while (current.next != null){
            current =  current.next;
        }
        current.next = newNode;
    }

    public void deleteAtPosition(int index){
        if (head == null){
            System.out.println("链表是空的，不能删除");
            return;
        }

        if (index == 0){
            head =head.next;
            return;
        }

        ListNode current = head;
        for (int i =0;i<index-1;i++){
            if (current.next == null){
                System.out.println("位置超出链表长度");
                return;
            }
            current = current.next;
        }
        if (current.next == null){
            System.out.println("位置超出链表长度");
            return;
        }
        current.next = current.next.next;
    }
}
