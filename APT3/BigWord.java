import java.util.*;
public class BigWord {
      public String most(String[] sentences) {
        for (int i = 0; i <sentences.length; i++){
            sentences[i] = sentences[i].toLowerCase(); // make it lower case 
            //System.out.println(sentences[i]); works
        }
        HashSet <String> uniquewords = new HashSet<String>();
        for(String s: sentences){
           String arr[] = s.split(" ");
           for(int i = 0; i<arr.length; i++){
                uniquewords.add(arr[i]); 
           }
        }
        System.out.println(uniquewords);// works till here 
        ArrayList<String> allwords = new ArrayList<String>();
        for(String s: sentences){
           String arr[] = s.split(" ");
           for(int i = 0; i<arr.length; i++){
                allwords.add(arr[i]);
           }
        }
       System.out.println(allwords); // works till here 
        List<String> listunique = new ArrayList<String>(uniquewords);
        int counter[] = new int[listunique.size()]; // counters array
        for(int j =  0; j<counter.length; j++){
            counter[j] = Collections.frequency(allwords, listunique.get(j)); // counted the number of times each word occurs
        } 
        for(int j =  0; j<counter.length; j++){
            System.out.print(counter[j]);
         } 
        String maxword = "";
        int max = 0;
         for(int l = 0; l<counter.length; l++){
            if(counter[l]>max){
                max = counter[l];
                maxword = listunique.get(l);
            }
         }
         System.out.println(max);
      return maxword;
  }
}