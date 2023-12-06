import java.util.*;
public class AlphaLength {
      public ListNode create (String[] words) {
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        HashSet<String> sorted = new HashSet<String>();
        for(String s: words){
            sorted.add(s);
        } // removed duplicates
        /*
        String[] alpha = new String[sorted.size()];
        for(int i = 0; i<alpha.length; i++){
            alpha[i] = sorted.get(i);
        }
        Arrays.sort(alpha); // sorting it into alphabetical order
        for(int i=0; i<alpha.length; i++){ 
            System.out.println(alpha[i]);
        }
         */
        String[] alpha= sorted.toArray(new String[sorted.size()]);
        Arrays.sort(alpha);
        for(String s: alpha){
            //Integer len = s.length();
            list.add(s.length());
        } //made the list
        //constructing the linked list
        ListNode first = null;
        ListNode given = null;
        for(Integer i: list){
            if(first == null){
                first = new ListNode(i);
                given = first;
            }
            else{
                given.next= new ListNode(i);
                given = given.next;
            }
        }
	  return first;
      }
  }