class Solution:
    def findBall(self, grid: List[List[int]]) -> List[int]:
        
        def move(x, y):
            if grid[x][y] == 1:
                if y == len(grid[0]) - 1:
                    return None, None
                if grid[x][y + 1] == grid[x][y]:
                    # can move
                    return x + 1, y + 1
                else:
                    return None, None
                
            elif grid[x][y] == -1:  
                if y == 0:
                    return None, None
                if grid[x][y - 1] == grid[x][y]:
                    # can move
                    return x + 1, y - 1
                else:
                    return None, None
                
        def can_reach_bottom(x, y):
            if x == len(grid):
                return y
            next_x, next_y = move(x, y)
            if next_x is None:
                return -1
            return can_reach_bottom(next_x, next_y)
                
        ans = []      
        for ball in range(len(grid[0])):
            ans.append(can_reach_bottom(0, ball))
            
        return ans