import java.util.*;
public class SimpleWordGame{
   
    public int points(String[] player, String[] d){
        HashSet <String> set = new HashSet<String>();
        HashSet <String> dict = new HashSet<String>();
        for(String s : player) {
            set.add(s);
         } // set of words remembered by the plater with no duplicates 
         for(String q : d) {
            dict.add(q);
         }
        int score = 0; // counter for the score 
        for (String w: set){
            if(dict.contains(w)){
                score = w.length()*w.length() + score;
            }
            }
            return score;
        }
        
    }
 