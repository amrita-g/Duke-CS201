import java.util.*;
public class SortedFreqs {
    HashMap<String, Integer> freqWord = new HashMap<String, Integer>();
   /* 
    private class freqComparator implements Comparator<String>{
        @Override 
        public int compare(String word1, String word2){
            return word1.compareTo(word2);
        }
    }
    */ 
    public int[] freqs(String[] data) {
      
      // fill in code here
      for(int i=0;i<data.length;i++){
        freqWord.putIfAbsent(data[i], 0);
        if(freqWord.containsKey(data[i])){
            freqWord.put(data[i], freqWord.get(data[i])+1);
        }

    }
    String[] keyArray = freqWord.keySet().toArray(new String[0]);
    Arrays.sort(keyArray);
    int[] outputArr = new int[keyArray.length];
    for(int i=0;i<keyArray.length;i++){
        outputArr[i]=freqWord.get(keyArray[i]);
    }
    return outputArr;

}
    


  
 }