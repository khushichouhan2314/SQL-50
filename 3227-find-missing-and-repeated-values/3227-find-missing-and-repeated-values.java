class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       long m = grid.length;
     long n = m*m;
        long Sn = (n*(n+1))/2;
        long  Sn2 = (n*(n+1)*(2*n+1))/6;
        long s =0;
        long s2 = 0;
        for(int i =0;i<m;i++){
               for(int j =0;j<m;j++){
            
            s += grid[i][j];
            s2 += (long) grid[i][j]*grid[i][j] ;
        }}

        long  val1 = s-Sn;
        long val2 = s2-Sn2;
        val2  = val2/val1;
        long  x = (val1+val2)/2;
        long y = x-val1;
        return new int[] {(int)x ,(int)y};



        
    }
}