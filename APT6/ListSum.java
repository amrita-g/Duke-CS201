 public class ListSum {
      public int sum(ListNode list, int thresh) {
        ListNode given = list;
        int answer = 0;
        while(given != null){
            if(given.info > thresh){
                answer = answer+given.info;
            }
            given = given.next;
        }
	  return answer;
      }
  }