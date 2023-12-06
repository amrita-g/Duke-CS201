public class TotalLetterCount {
      public int total(String[] words, String letter) {  
        int count2 = 0;
        for(int j=0;j<words.length;j++){
            int count1 = 0; 
            for(int i=0; i<=words[j].length()-1; i++){
                if(words[j].substring(i,i+1).equals(letter)){
                    count1 = count1+ 1; //counts number of times it occurs in each word
                }
            }
            count2 = count2 + (count1*j);
          }
          return count2;
      }
  }
//2+6+6