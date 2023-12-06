public class CounterAttack {
     public int[] analyze(String str, String[] words) {
        String arr[] = str.split(" ");
        int answer[] = new int[words.length];
         for(int j = 0; j<words.length; j++){
            int count = 0; //new counter for each alphabet
            for(int i=0; i<arr.length; i++){ //check if each alphabet is there 
                if(arr[i].equals(words[j])){
                    count = count + 1;
                }
                answer[j] = count;
            }
         }
         return answer;
     }
 }