public class PrefixCode { 
      public String isOne(String[] words) {
        if(words.length == 1) return "Yes";
        for(int i =0; i<words.length;i++){
            for(int j = 0; j<words.length; j++){
                if(words[j].startsWith(words[i]) && !(i==j)){
                    return "No, " + Integer.toString(i);
                }
                }
            }
        
         return "Yes";
      }
   }