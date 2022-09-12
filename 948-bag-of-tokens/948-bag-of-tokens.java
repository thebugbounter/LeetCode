class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int points=0;
        int res=0;
        while(i<=j)
        {
            if(power>=tokens[i])
            {
                power-=tokens[i++];
                res=Math.max(res,++points);
            }
            else if(points>0)
            {
               points--;
                power+=tokens[j--];
            }
            else
            {
                break;
            }
            
            
            
        }
        return res;
    }
}