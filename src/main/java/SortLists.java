public class SortLists {
    public static ListNode sort(ListNode listNode1, ListNode listNode2) {
        ListNode result = null;
        if (listNode1 == null && listNode2 == null) {
            return result;
        }
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        if (listNode1.value < listNode2.value) {
            result = new ListNode(listNode1.value);
            result.next = sort(listNode1.next, listNode2);
        } else {
            result = new ListNode(listNode2.value);
            result.next = sort(listNode2.next, listNode1);
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1_1 = new ListNode(1);
        ListNode listNode2_1 = new ListNode(2);
        ListNode listNode1_2 = new ListNode(3);
        ListNode listNode2_2 = new ListNode(4);
        ListNode listNode1_3 = new ListNode(5);
        listNode1_2.next = listNode1_3;
        listNode1_1.next=listNode1_2;

        listNode2_1.next = listNode2_2;
        ListNode result = sort(listNode1_1, listNode2_1);

        while (result != null) {
            System.out.println("node " + result.value);
            result = result.next;
        }
    }
}
