import java.util.*;

public class TxMsg {
      public String getMessage(String original) {
        String[] words= original.split(" ");
        for(int k =0; k<words.length; k++){
          words[k] = convert(words[k]);
        }
        return String.join(" ", words);
      }
      private String convert(String word){
        String ret = "";
       // if(isVowel(word.charAt(0))){ 
        for(int i = 0; i<word.length(); i++){
          if(isVowel(word.charAt(i))){
            ret = ret + word.charAt(i);
          }
          if(!isVowel(word.charAt(i))){
            break;
          }
          if(ret.length() == word.length()){
            return ret;
          }
        }
        //}
        ret = "";
        if(!isVowel(word.charAt(0))){
          ret = ret + word.charAt(0);
        }
        for(int k = 1; k<word.length(); k++){
          if(!isVowel(word.charAt(k)) && isVowel(word.charAt(k-1))){
            ret += word.charAt(k);
          }
        }
         return ret;  
        }
        private boolean isVowel(char ch){
          return "aeiou".indexOf(ch)>=0;
      }
        }