import java.util.*;
public class ListsEqual {
      public int equal (ListNode a1, ListNode a2) {
        int answer = 1;
        ListNode given1 = a1;
        ListNode given2 = a2;
        int count1 = 0;
        int count2 = 0;
        //ListNode given = list;
        while(given1 != null){
            count1 = count1 + 1;
            given1 = given1.next;
        }
        while(given2 != null){
            count2 = count2 + 1;
            given2 = given2.next;
        }
        if(count1 != count2){
            return 0;
        }
        while((given1 != null) && (given2 !=null)){
            if(given1.info != given2.info){
                answer = 1;
                break;
            }
            given1 = given1.next;
            given2 = given2.next;
        }
          // replace statement below with code you write
	  return answer;
      }
  }