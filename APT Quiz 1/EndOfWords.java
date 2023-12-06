import java.util.*;
public class EndOfWords {
      public String[] filter(String[] words){
          ArrayList<String> arr = new ArrayList<String>();
          ArrayList<String> charss = new ArrayList<String>();
            for(int i =0; i<words.length;i++){
                if(words[i].substring(0,1).equals((words[i].substring(words[i].length()-1, words[i].length())))){
                     if(!charss.contains(words[i].substring(0,1))){
                        arr.add(words[i]);
                        charss.add(words[i].substring(0,1));
                    }
                }
            }
          String[] answer = new String[arr.size()];
          for(int i =0; i<answer.length;i++){
            answer[i] = arr.get(i);
          }
          return answer;
      }
  }