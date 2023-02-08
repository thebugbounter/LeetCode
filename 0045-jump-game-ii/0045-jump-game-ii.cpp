class Solution {
public:
    int jump(vector<int>& nums) {
        //Time complexity: O(N) Space complexity: O(1)
       int curStep = 0, i = 0, n = nums.size(), level = 0;
            
        while(curStep < n-1) {
            level++; //BFS level
            int preStep = curStep; //update preStep
            for(;i <= preStep;++i) { //traverse of preStep level and find the max step of this level
                curStep = max(curStep, i+nums[i]);
            }
        }
        
        return level;
    }
};