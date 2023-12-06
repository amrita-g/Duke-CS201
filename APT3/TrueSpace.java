public class TrueSpace {
      public long calculateSpace(int[] sizes, int clusterSize) {
        long clusval = 0;
        long LongclusterSize = clusterSize;
         for (int i = 0; i < sizes.length; i++) {
            long remsize = sizes[i];
            if(LongclusterSize == 1){
                break;
            }
            while(remsize > 0 ) {
                remsize -= LongclusterSize;
                clusval++;
            }
         }
         if (clusterSize == 1){
            for (int i = 0; i < sizes.length; i++) {
                clusval += sizes[i];
            }
        }

         return clusval*clusterSize;
      }
      
   }