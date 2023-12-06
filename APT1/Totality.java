public class Totality{
    public static void main(String[] args) {
        int[] a = {22,23};
        //System.out.println(sum(a,"even")); // testing the code to see if it works
    }
    public int sum(int[] a, String stype){
    int total = 0;
    if (stype.equals("odd")){
        for(int i=1; i<a.length; i+=2){
            total = total + a[i];
        }
    }
    if(stype.equals("even")){
        for(int i=0; i<a.length; i+=2){
            total = total + a[i];
        }
    }
    if(stype.equals("all")){
    for(int i=0; i<a.length; i++){
        total = total + a[i];
    }
    }
    return total;
    }
}