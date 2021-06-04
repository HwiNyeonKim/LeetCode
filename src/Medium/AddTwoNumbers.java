package Medium;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(-1); // dummy value
        ListNode ptr = answer;

        boolean carry = false;
        while (l1 != null || l2 != null || carry) {
            int num1 = 0;
            int num2 = 0;

            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            int ansVal = num1 + num2;

            if (carry) {
                ansVal++;
                carry = false;
            }

            if (ansVal >= 10) {
                carry = true;
                ansVal %= 10;
            }

            ptr.next = new ListNode(ansVal);
            ptr = ptr.next;
        }

        return answer.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}