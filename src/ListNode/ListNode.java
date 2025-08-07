package ListNode;

// 链表节点类
// 这是一个节点类
public class ListNode {
    int val;  // 节点中存的值,比如1,2,3等
    ListNode next;  // 指向下一个节点

    //构造函数,用来创建一个新的节点并赋值
    ListNode(int val){
        this.val =val;
        this.next = null;
    }
}
