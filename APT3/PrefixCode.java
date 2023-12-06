import java.util.*;
public class PrefixCode { 
      public String isOne(String[] words) {
        ArrayList<String> allwords =  new ArrayList<String>(Arrays.asList(words));
        if(allwords.size() == 1){ //exception case 
            return "Yes";
        }
        else{
            for(int i =0; i<words.length; i++){
                for(int j =1; j<words.length; j++){
                    if(words[j].length()>=words[i].length()){
                        if(words[j].startsWith(words[i])){
                            return ("No, " + i);
                        }
                        else{    
                           // for(int k = 0; k<words[i].length();k++){
                            if(!(words[j].startsWith(words[i]))){
                                return "Yes";
                            }
                            }
                      //else{
                        //   return "Yes";
                        //}
                        }
                    //if(words[j].length()<words[i].length()){
                      //  if(words[i].startsWith(words[j])){
                        //    return ("No, " + j);
                        //}
                        //else{
                          //  return "Yes";
                        //}
                    //}
                    //int j = 0;
                    // assuming i is the word which is the prefix snd j is the word we are checking for the presentce of the prefix. 
                    /* 
                    if(words[j].length()>=words[i].length()){
                        for(int k = 0; k<words[i].length();k++){
                            if(!(words[j].charAt(k) == (words[i].charAt(k)))){
                                return "Yes";
                            }
                        }
                    }   
                    else{
                         
            
                    }
                     */
                       // else{
                         //   return ("No, " + i);
                        //}
                        }
                    }
                  //  if(allwords.get(j).contains(allwords.get(i))){
                    //    return ("No, " + j);
                    //}
                    //else{
                      //  return "Yes";
                    //}
            
                    }
        return "Yes";
    }

}