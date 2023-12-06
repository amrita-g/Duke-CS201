public class Common {
     public int count (String a, String b) {
        int countera = 0;
        int counterb = 0;
        int counter = 0;

        for(int i = 0; i<a.length(); i++){
            for(int j = 0; j<b.length(); j++){
                if(b.charAt(j) == a.charAt(i)){ // checks if the word is in common
                counterb++;
                }
                    char same = a.charAt(i);
                for(int k = 0; k<a.length(); k++){
                    if(same == a.charAt(k)){
                    countera++; // counts the number of times the char occurs
                    }}
                if(countera == counterb){ // if the same number of times then add the number
                    counter = countera;
                }
                if(countera>counterb){ // if a is more then add b number of times
                    counter = counterb;
                }
                if(countera<counterb){ // if b is more then add a number of times 
                    counter = countera;
                }

/*

                }
                for(int l = 0; l<b.length(); l++){ // counts no of times char occurs
                    if(same == b.charAt(l)){ 
                       counterb++;
                    }
                }
                }
            }
            if(countera == counterb){ // if the same number of times then add the number
                    counter = countera;
                }
                if(countera>counterb){ // if a is more then add b number of times
                    counter = counterb;
                }
                if(countera<counterb){ // if b is more then add a number of times 
                    counter = countera;
                }
        }
*/
       
     }
  
}return counter; }}