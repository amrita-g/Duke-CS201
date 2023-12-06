import java.util.*;
public class SimpleHash {
      public String[] calculate(String[] list){
          String[] alphabets = {"a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
          HashMap<String, Integer> map = new HashMap<String, Integer>();
          for(int i = 0; i<list.length; i++){
            int sum = 0;
            for(int j = 0; j<list[i].length();j++){
                for(int k =0; k<26;k++){
                    if(list[i].substring(j,j+1).equals(alphabets[k])){
                        sum = sum + nums[k];
                    }
                }
            }
            map.put(list[i], sum); 
          }
          System.out.println(map);// works till here
          ArrayList <Integer> values = new ArrayList<Integer>();
          ArrayList <String> keys = new ArrayList<String>();
          for(Map.Entry<String, Integer> entry: map.entrySet()){
            values.add(entry.getValue());
            keys.add(entry.getKey());
          }
           System.out.println(keys);
           System.out.println(values);
           HashMap<Integer, ArrayList<String>> map2 = new HashMap<Integer, ArrayList<String>>();
           /*
           for(Map.Entry<String, Integer> entry: map.entrySet()){
                for(Map.Entry<String, Integer> entry1: map.entrySet()){
                    if(entry.getValue()==entry1.getValue()&&!(entry.getKey()==entry1.getKey())){
                        map2.putIfAbsent(entry.getValue(), new ArrayList<String>());
                        map2.put(entry.getKey());
                        map2.put(entry1.getKey());
                    }
                }
           }
           int[] hcv = new int[map2.size()];
           for(Map.Entry<String, Integer> entry: map2.entrySet()){
            for(int i = 0; i<map2.size();i++){
                hcv[i] = entry.getKey();
            }
           }
           Arrays.sort(hcv);
           String[] output = new String[map2.size()];
           for(int i = 0; i<hcv.length;i++){
            output[i] +=""+Integer.toString(hcv[i])+":";
            for(int j = 0;j<map2.get(hcv[i]).size(); j++){
                output[i] +=" "+map2.get(hcv[i].get(j));
            }
           }
           */
         
          // for(int i =0; i<values.size(); i++){
            //if(values.get(i).equals(values.get(i+1))){
              
            //}
           //}



           for(int i =0; i<values.size(); i++){
            int count = 0;
            ArrayList <String> answers = new ArrayList<>();
             for(int j =i; j<values.size(); j++){
                if(values.get(i)==values.get(j)){
                    count++;
                    answers.add(keys.get(j));
            }
            //if(count>=2){
              //  answers.add(keys.get(i));
            //}
          }
          if(count>2){
                map2.putIfAbsent(values.get(i), answers);
        }
    }
    System.out.println(map2);
    int[] hcv = new int[map2.size()];
    Arrays.sort(hcv);
    String[] output = new String[map2.size()];
           for(int i = 0; i<hcv.length;i++){
                output[i] +=""+Integer.toString(hcv[i])+":";
            for(int j = 0;j<map2.get(hcv[i]).size(); j++){
                output[i] +=" "+map2.get(hcv[i]);

        System.out.println(map2);// words are there. need to sort by values and print
            }}
          return output;
      }
  }//5+12+6