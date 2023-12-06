import java.util.*;
public class Infrequent {
      public String find(String[] phrases){
          //convert everything to lower case
          //least occuring word 
          //for each string, count the number of times a word occurs. use a hashmap to keep track of all the words that occur. then convert the hashmap values to an array and find the minimum and public the key at that index in lower case
          HashMap<String, Integer> map = new HashMap<>();
          String[] phrases2 = new String[phrases.length];
          int lengthifoneword = 0;
          for(int i = 0; i<phrases.length; i++){
            phrases2[i] = phrases[i].toLowerCase(); 
          }
          for(String s: phrases2){
            String[] arr = s.split(" ");
            lengthifoneword = arr.length;
            for(int i = 0; i<arr.length;i++){
                 map.putIfAbsent(arr[i], 0);
            }
            
            for(int i = 0; i<arr.length;i++){
                 map.put(arr[i], map.get(arr[i])+1 );
            
            }
          }
          System.out.println(map);
          ArrayList<Integer> values = new ArrayList<Integer>();
          for(Map.Entry<String, Integer> entry: map.entrySet()){
            values.add(entry.getValue());
        }
        int[] intvals = new int[values.size()];
        for(int i=0; i<values.size(); i++){
            intvals[i] = values.get(i);
        }
        System.out.println(values);
        int min = 0;
        if(values.size()>1){
            for(int i = 0; i<values.size(); i++){
                for(int j = 0; j<values.size();j++){
                    if(values.get(i)<values.get(j)){
                        System.out.println("Passed");
                        System.out.println(values.get(i));
                        System.out.println(values.get(j));
                            min = values.get(i);
                    }
                }
            }
        }
        else{
            min = 14;
        }
        System.out.println(min);
        HashSet<String>answers = new HashSet<String>();
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            if(entry.getValue().equals(min)){
                System.out.println(entry.getKey());
                answers.add(entry.getKey());
            }
        }
        String soln = "";
        for(String s: answers){
            soln = s;
        }
        return soln;
  }
}