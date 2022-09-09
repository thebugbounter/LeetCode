class Solution:
    def numberOfWeakCharacters(self, p: List[List[int]]) -> int:
        ## any i < j, p[i][0] > p[j][0] and if p[i][0] == p[j][0] then p[i][1] < p[j][1]       
        p.sort(key=lambda x: (-x[0],x[1])) 

        ans = 0
        curr_max = 0

        for _, d in p:
            if d < curr_max:
                ans += 1
            else:
                curr_max = d
        return ans        

#         a < b < c < d
#         a < b, b < c, a < c, c < d, b < d, a < d (1+4)*4/2
