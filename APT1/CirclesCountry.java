public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        //using distance formula to calculate the distance between the points 
        int crosses = 0;
        for(int k=0; k < x.length; k+= 1){
            if (isInside(x1,y1,x[k],y[k],r[k]) && ! isInside(x2,y2,x[k],y[k],r[k])) {
                crosses += 1;
            }
            if (!isInside(x1,y1,x[k],y[k],r[k]) && isInside(x2,y2,x[k],y[k],r[k])) {
                crosses += 1;
            }
        }
        return crosses;
    }
    public boolean isInside(int x, int y, int cx, int cy, int r){
		double dist = (x-cx)*(x-cx) + (y-cy)*(y-cy);
		double radSquared = r*r;
           return dist < radSquared;
 }
}