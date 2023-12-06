public class DoubleList {
      public ListNode bigify(ListNode list) {
          ListNode temp = list; //A-B-C
          while(temp!=null){
                temp.next = new ListNode(temp.info, temp.next); //A-A-B-C
                temp = temp.next.next;
          }
          return list;
      }
  }