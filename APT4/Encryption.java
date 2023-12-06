import java.util.HashMap;

public class Encryption {
       public String encrypt(String message){
           HashMap<Character, Character> myMap = new HashMap<>();
           char[] arr = message.toLowerCase().toCharArray();
           char current = 'a';
           String retval = "a";
           myMap.put(arr[0], 'a');

           for (int i = 1; i < arr.length; i++) {
                if (myMap.containsKey(arr[i])){
                    retval += myMap.get(arr[i]);
                } else {
                    current += 1;
                    myMap.put(arr[i], current);
                    retval += current;
                }
    
           }
           return retval;
       }
   }