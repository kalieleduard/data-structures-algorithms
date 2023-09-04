package leetcodeSolutions.mergeTwoSortedLists;

class Application {
    public static void main(String[] args) {
        final var node1 = new ListNode();
        node1.val = 1;

        node1.next = new ListNode();
        node1.next.val = 2;

        node1.next.next = new ListNode();
        node1.next.next.val = 4;

        final var node2 = new ListNode();
        node2.val = 1;

        node2.next = new ListNode();
        node2.next.val = 3;

        node2.next.next = new ListNode();
        node2.next.next.val = 4;

        final var aSolution = new Solution();
        final var result = aSolution.mergeTwoLists(node1, node2);
    }

    private static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    list1.next = mergeTwoLists(list1.next, list2);
                    return list1;
                } else {
                    list2.next = mergeTwoLists(list2.next, list1);
                    return list2;
                }
            }
            return list1 == null ? list2 : list1;
        }
    }
}
