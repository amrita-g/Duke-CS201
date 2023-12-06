public class SoccerLeagues {
     public int[] points(String[] matches) {
        int[] retval = new int[matches.length];
        for (int i = 0; i < matches.length; i++){
            char[] current = matches[i].toCharArray();
            for (int j = 0; j < current.length; j++){
                if (current[j] == 'W') {
                    retval[i] += 3;
                }
                if (current[j] == 'D') {
                    retval[i] ++;
                    retval[j] ++;
                }
                if (current[j] == 'L') 
                    retval[j] += 3;
                }
            }
        return retval;
     }
 }