import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairDown {
     public int[] fold(int[] list) {
        if(list.length%2 == 1){
            ArrayList<Integer> arrlist =  new ArrayList<Integer>();
            for(int i = 0; i<list.length; i++){
                arrlist.add(list[i]);
            }
            arrlist.add(0);
            System.out.println(arrlist);
            int [] arr = new int[arrlist.size()];
            for(int i = 0; i<arrlist.size(); i++){
                arr[i] = arrlist.get(i);
             }
        return helper(arr);
        } 
        else{
            return helper(list);
        }   
}
    public int[] helper(int[] arr){
        int[] answer = new int[arr.length/2];
        int j = 0;
     for(int i = 0; i<arr.length; i++){
        answer[j] = arr[i]+arr[i+1];
        i++;
        j++;
    }
    return answer;
 }
}