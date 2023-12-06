import java.util.*;
public class SortByFreqs {

    HashMap<String, Integer> freqWord = new HashMap<String, Integer>();
    
    private class freqComparator implements Comparator<String>{
        @Override 
        public int compare(String word1, String word2){
            int freq1 = freqWord.get(word1);
            int freq2 = freqWord.get(word2);
          
            if(freq2-freq1==0){
                return word1.compareTo(word2);
            }
           return freq2-freq1;    
    }
    }
    public String[] sort(String[] data) {
        
        for(int i=0;i<data.length;i++){
            freqWord.putIfAbsent(data[i], 0);
            if(freqWord.containsKey(data[i])){
                freqWord.put(data[i], freqWord.get(data[i])+1);
            }
        }
        System.out.println(freqWord);
        
        System.out.println(Arrays.toString(freqWord.keySet().toArray(new String[0])));
        String[] keyArray = freqWord.keySet().toArray(new String[0]);
        Arrays.sort(keyArray, new freqComparator());
        return keyArray;
    }

}