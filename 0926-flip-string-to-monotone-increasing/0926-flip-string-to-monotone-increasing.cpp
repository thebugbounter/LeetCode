class Solution {
public:
    int minFlipsMonoIncr(string S) {
        int ones = 0,
            zeroes = 0,
            ans = 0, s = 0;
        for (int i = 0; i < S.size(); i++) {
            if (S[i] == '0')
                zeroes++;
        }
        ans = zeroes;
        for (int i = 0; i < S.size(); i++) {
            if (S[i] == '1') {
                ones++;
            }
            else
                zeroes--;
            ans = min(ans, ones + zeroes);
        }
        return ans;
    }
};