public class Gravity {
    public static void main(String[] args) {
        //int[] rights = {0,1,2,3,4,5};
        //System.out.println(canAccess(rights, 2)); // testing the code to see if it works
    }
      public double falling(double time, double velo){
        // fill in code here
        return time*velo+0.5*9.8*time*time;
      }
  }
