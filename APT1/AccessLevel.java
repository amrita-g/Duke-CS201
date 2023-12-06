 public class AccessLevel {
    public static void main(String[] args) {
        int[] rights = {0,1,2,3,4,5};
        //System.out.println(canAccess(rights, 2)); // testing the code to see if it works
    }
     public String canAccess(int[] rights, int minPermission) {
        String ret = "";
            for(int i = 0; i<rights.length; i++){
                if(minPermission<= rights[i]){
                    ret = ret + "A";}
                else{
                    ret= ret+ "D";
                }
                }
                return ret;
            } 
     }

     

     
  
