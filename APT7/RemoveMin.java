public class RemoveMin {
    public ListNode remove (ListNode list) {
        if (list == null || list.next == null) {
            return null; // Cannot remove from an empty list or a list with only one node.
        }
        // Find the node with the minimum value
        ListNode curr = list;
        ListNode prev = null;
        ListNode minNode = list;
        ListNode prevMinNode = null;
        while (curr != null) {
            if (curr.info < minNode.info) {
                minNode = curr;
                prevMinNode = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        // Remove the node with the minimum value
        if (prevMinNode == null) {
            // If the minimum node is the head of the list
            list = list.next;
        } else {
            prevMinNode.next = minNode.next;
        }
        return list;
    }
}