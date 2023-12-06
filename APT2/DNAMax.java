//import java.util.Arrays;
//import java.util.ArrayList;
import java.util.*;
public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        //String[] retvalue = {};  
        ArrayList<String> list = new ArrayList<>();
        for(String str: strands){
            if(str.contains(nuc)){
                list.add(str);
               // nlist = list.toArray(str);
            }
        }
            String answer = "";
            for(int i = 0; i<=list.size(); i++){
                if(list.get(i).length()>= list.get(i+1).length()){
                    answer = list.get(i);
                }
            }
            return answer;
            }
          }
 