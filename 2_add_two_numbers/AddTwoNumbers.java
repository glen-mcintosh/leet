/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;
        int digit = 0;
        int val1 = 0;
        int val2 = 0; 


        ListNode current1 = l1;
        ListNode current2 = l2;

        ListNode head = null;
        ListNode tail = null;

        while ((current1 != null || current2 != null || carry != 0)) {
          val1 = current1 != null ? current1.val : 0;
          val2 = current2 != null ? current2.val : 0;
          sum = val1 + val2 + carry;
          digit = sum % 10;
          carry = sum / 10;

          ListNode newNode = new ListNode(digit);

          if (head == null) {
              head = newNode;
              tail = newNode;
          } else {
              tail.next = newNode;
              tail = newNode;
          }

          if (current1 != null) {
              current1 = current1.next;
          }
          if (current2 != null) {
              current2 = current2.next;
          }
        }

        return head;
    }

    public static void main(String[] args) {
        // ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        // ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));


        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9,
                new ListNode(9))))))))));

        AddTwoNumbers solution = new AddTwoNumbers();

        solution.addTwoNumbers(l1, l2);
    }
}