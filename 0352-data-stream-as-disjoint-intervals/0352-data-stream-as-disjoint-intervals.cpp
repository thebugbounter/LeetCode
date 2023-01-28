class SummaryRanges {
public:
  /** Initialize your data structure here. */
  SummaryRanges() {
        
  }
    
  void addNum(int val) {
    data_.insert(val);
  }
    
  vector<vector<int>> getIntervals() {
      vector<vector<int>> res;
      int start = -1;
      int end = -1;
      for (const auto& item: data_) {
          if (start == -1) {
              start = item;
              end = item;
          } else if (item == end + 1) {
              end = item;
          } else {
              res.push_back({start, end});
              start = end = item;
          }
      }
      
      if (start != -1) res.push_back({start, end});
      
      return res;
  }
private:
  set<int> data_;
};