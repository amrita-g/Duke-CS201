import java.util.*;
public class MedalTable {
    HashMap<String, int[]> countryWins = new HashMap<String, int[]>();
    private class freqComparator implements Comparator<String>{
        @Override 
        public int compare(String word1, String word2){
            int freq1 = countryWins.get(word1)[0];
            int freq2 = countryWins.get(word2)[0];
            if(freq2-freq1!=0){
                return freq2-freq1;
            } else {
                freq1 = countryWins.get(word1)[1];
                freq2 = countryWins.get(word2)[1];
                if(freq2-freq1!=0){
                    return freq2-freq1;
                } else {
                    freq1 = countryWins.get(word1)[2];
                    freq2 = countryWins.get(word2)[2];
                    if(freq2-freq1!=0){
                        return freq2-freq1;
                    } else {
                        return word1.compareTo(word2);
                    }
                }
            }
        }
    }
        
    public String[] generate(String[] results) {
       // you fill in this code
       
       for(int i=0;i<results.length;i++){
        String[] titles = results[i].split(" ");
    
        for(int j=0;j<titles.length;j++){
            countryWins.putIfAbsent(titles[j], new int[3]);
            if(countryWins.containsKey(titles[j])){
                countryWins.get(titles[j])[j]=countryWins.get(titles[j])[j]+1;
            }
        }

       }
       for(Map.Entry<String, int[]> entry: countryWins.entrySet()){
            System.out.println(entry.getKey()+" "+Arrays.toString(entry.getValue()));
       }
       String[] keyArray = countryWins.keySet().toArray(new String[0]);
       Arrays.sort(keyArray, new freqComparator());
       String[] outputArr = new String[keyArray.length];
       for(int i=0;i<keyArray.length;i++){
        outputArr[i] = keyArray[i]+" "+countryWins.get(keyArray[i])[0]+" "+countryWins.get(keyArray[i])[1]+" "+countryWins.get(keyArray[i])[2];
       }
       return outputArr;
    }
  }