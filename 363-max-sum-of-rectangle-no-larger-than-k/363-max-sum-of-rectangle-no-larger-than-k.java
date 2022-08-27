public class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;

        int m=matrix.length;
        int n=matrix[0].length;

        int result = Integer.MIN_VALUE;

        for(int c1=0; c1<n; c1++){
            int[] each = new int[m];
            for(int c2=c1; c2>=0; c2--){

                for(int r=0; r<m; r++){
                    each[r]+=matrix[r][c2];   
                }

                result = Math.max(result, getLargestSumCloseToK(each, k));
            }
        }

        return result;
    }

    public int getLargestSumCloseToK(int[] arr, int k){
        int sum=0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        int result=Integer.MIN_VALUE;
        set.add(0);

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];

            Integer ceiling = set.ceiling(sum-k);
            if(ceiling!=null){
                result = Math.max(result, sum-ceiling);        
            }

            set.add(sum);
        }

        return result;
    }
}
