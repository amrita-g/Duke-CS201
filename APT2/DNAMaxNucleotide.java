import java.util.*;
import java.util.ArrayList;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        int counter = 0;
        int count = 0; //max number of alphabets
        int length = 0; //length of word 
        String answer = ""; // output
        int[] list = new int[strands.length];
        for(int i=0;i<strands.length;i++){
            counter = 0; // resets for each word
            for(int j=0; j<strands[i].length();j++){
                if(strands[i].substring(j,j+1).equals(nuc)){
                    counter+=1;
                    list[i]=counter;
                }//keeps count 
            }
        }
        ArrayList<String> list2 = new ArrayList<>();
        for(String str: strands){
            if(str.contains(nuc)){
                list2.add(str);
            }
        }
        if(list2.size() == 0){
                answer = "";
                return answer;
            }    
            if(list2.size()==1){
                answer = list2.get(0);
                return answer;
            }


        for(int k=0; k<strands.length; k++){
            if(list[k]>count){
                count=list[k];
                length=strands[k].length();
                answer = strands[k];
            }
            if(list[k]==count){
                if (strands[k].length()>length){
                    length=strands[k].length();
                    answer = strands[k];
                    count=list[k];
                }
                
            }
         }
         
        
        return answer;
    }
}