import java.util.HashSet;
public class Starter{
    public static void main(String[] args) {
       String[] words = {"easy", "lies", "the", "head", "that", "wears", "yellow"};
        String first = "e";
       // System.out.println(begins(words, first));
    }
     public int begins(String[] words, String first) {
      HashSet<String> norepeats = new HashSet<String>();
        int count = 0;
      for(int i=0; i<words.length;i++){
         norepeats.add(words[i]);
      }
      for(String i: norepeats){
         if(i.substring(0,1).equals(first))
         count = count +1;
      }
      /* HashSet<String> worepeats = new HashSet<>(Arrays.asList(words));
        int count = 0;
         for(String i: worepeats){
               char initial = i.charAt(0);
               char f = first.charAt(0);
               if(initial == f){
                  count = count + 1;
            }
         }*/
         return count;
     }
 }