package linkedlist;

/*
 * 876. Middle of the Linked List
 * */

public class LinkedListMid {

  public static class Node {
    int val;
    Node next;

    public Node(int val) {
      this.val = val;
    }
  }

  public static Node midOrUpMidNode(Node head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    Node slow = head.next;
    Node fast = head.next.next;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static Node midOrDownMidNode(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node slow = head.next;
    Node fast = head.next;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static Node midOrUpMidPreNode(Node head) {
    if (head == null || head.next == null || head.next.next == null) {
      return null;
    }
    Node slow = head;
    Node fast = head.next.next;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static Node midOrDownMidPreNode(Node head) {
    if (head == null || head.next == null) {
      return null;
    }
    if (head.next.next == null) {
      return head;
    }
    Node slow = head;
    Node fast = head.next;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

}
