
class Solution {
public:
    struct pair_hash_int {
        inline std::size_t operator()(const std::pair<int,int> & v) const {
            return v.first*31+v.second;
        }
    };
    
    void non_zero_cells(vector<vector<int>>& mat,
                       vector<pair<int, int>>& ones){
        int n = mat.size();
        
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                if(mat[i][j]){
                    ones.push_back({i, j});
                }
            }
        }
    };
    
    int largestOverlap(vector<vector<int>>& A, vector<vector<int>>& B) {
        vector<pair<int, int>> A_ones;
        vector<pair<int, int>> B_ones;
        
        non_zero_cells(A, A_ones);
        non_zero_cells(B, B_ones);
        
        int maxOverlaps = 0;
        unordered_map<pair<int, int>, int, pair_hash_int> groupCount;
        
        for(pair<int, int>& a : A_ones){
            for(pair<int, int>& b : B_ones){
                pair<int, int> v = {b.first-a.first, b.second-a.second};
                ++groupCount[v];
                maxOverlaps = max(maxOverlaps, groupCount[v]);
            }
        }
        
        return maxOverlaps;
    }
};

