public class ListLastFirst {
    public ListNode move(ListNode list) {
        // replace statement below with code you write
       //edge case 
        if (list == null || list.next == null) {
            return list;
        }
        ListNode current = list;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        System.out.println(previous.info);
        // Move the last node to the front
        previous.next = null;
        current.next = list;
       // System.out.println(current.next.info);
        list = current;

        return list;
        
    }
}