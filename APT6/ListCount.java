 import java.util.*;
 public class ListCount {
      public int count (ListNode list) {
        int answer = 0;
        ListNode given = list;
        while(given != null){
            answer = answer + 1;
            given = given.next;
        }
	  return answer;
      }
  }