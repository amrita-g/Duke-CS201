import java.util.*;
public class StringCuts {
    public String[] filter(String[] list, int minLength) {
         /*
          * Return a String[] array of the unique strings in list whose lengths are greater than or equal to minLength.
          */
          
        HashSet <String> set = new HashSet<String>();
        for(int i = 0; i<list.length; i++){
            if(list[i].length()>=minLength){
                set.add(list[i]); //add elements that pass to the hashset to avoid any repitition 
            }
        }
        System.out.println(set);
        String [] arr = set.toArray(new String [set.size()]); //hashset becomes an array
        ArrayList<String> arrays =  new ArrayList<String>();
        String answer[] = new String[set.size()];
        //need to reorder the code 
        int m = 0;
        for(int j=0; j<list.length; j++){
            for(int k=0; k<arr.length;k++){
                if(list[j].equals(arr[k])){
                    if(!arrays.contains(list[j])){
                        answer[m] = arr[k];
                        arrays.add(arr[k]);
                        m = m+1;
                    }
                }
                   
            }
        }
     

        /*
        int j=set.size()-1;
        String arr[] = new String[set.size()];
        String answer[] = new String[set.size()];
        for(String ele:set){ //move the elements from a hashset to an array 
          arr[j] = ele;
           j = j-1;
        }
        for(int i=0; i<list.length; i++){
            for(int l =0; l<set.size(); l++){
                for(int k = 0; k<set.size(); k++){
                if(list[i].equals(arr[l])){
                         answer[k] = arr[l];
                    }
                }
            }
        } */
       // int j=set.size()-1;
       // String arr[] = new String[set.size()];
        //for(String ele:set){ //move the elements from a hashset to an array 
          //  arr[j] = ele;
            //j = j-1;
        //}

        //reorder array for response 
       // String arr[] = new String[set.size()];
        //for(int j = set.size(); j>=0; j--){
          //  arr[j] = set.get(set.size() - j);
        //}
        //String[] arr= set.toArray(new String[set.size()]);
        return answer;
       // String[] arr = HashSet.toArray();
        //return arr;
    }
}