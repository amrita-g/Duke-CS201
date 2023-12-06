import java.util.HashMap;

public class ErdosNumber {
    public String[] calculateNumbers(String[] pubs) {
        HashMap <String, Integer> map = new HashMap<String, Integer>();
        String[] erdos = {};
        for(int i =0; i<pubs.length;i++){
            String[] authors = pubs[i].split(" ");
            for(int j =0; j<authors.length; j++){
                map.putIfAbsent(authors[j], null);
            }
            if(pubs[i].startsWith("ERDOS")){
                erdos = pubs[i].split(" ");
            }
        }//found erdos' co-authors 
        for(int i=0; i<pubs.length; i++){
            for(int j=0; j<erdos.length;j++){
                if(pubs[i].startsWith(erdos[j])&& !(erdos[j].equals("ERDOS"))){
                    String[] auth = pubs[i].split(" ");
                    for(int k=0; k<auth.length; k++){
                        map.put((map.get(auth[k]), map.getValue(auth(k)+1)));
                    }
                }
            }
        }
    String[] answer = new String[10];
      return answer;
    }
  }


