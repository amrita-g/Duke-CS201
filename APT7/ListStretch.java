public class ListStretch {
      public ListNode stretch (ListNode list, int amount){
          ListNode current = list; 
        while(current != null) {
            //gonna append to to current node n times - 1, since we need to count the original node itself
            for(int i = 1; i < amount; i++) {
                //if our list is A, B, C and amount is 2
                //setting current.next to new Node(A, B), so now we have A --> A ---> B
                current.next = new ListNode(current.info, current.next);
                //we need current = current.next so now current points to the new duplicated node
                //current now equals A --> B
                current = current.next;
            }
            //need to move along the list to get current.next, which is B in our case
            current = current.next;
        }
          return list;
      }
  }