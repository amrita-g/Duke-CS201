import java.util.*;
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders){
        Set<String> arr = new HashSet<>(Arrays.asList(available));
        String[] orderingredients = {};
        boolean ans = true;
        int answer = 0;
        for(int i = 0; i < orders.length; i++){
            ans = true;
            orderingredients = orders[i].split(" ");
            for(String ing : orderingredients){
                if(!arr.contains(ing)){
                    ans = false;
                } 
            }
            if(ans){
                return i;
            }
        }
        return -1;
     }
    }