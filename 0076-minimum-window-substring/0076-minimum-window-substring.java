public class Solution {
    // you need to include the 
    public String minWindow(String s, String t) {

        Map<Character, Integer> target = new HashMap<>();
        Map<Character, Integer> found = new HashMap<>();

        int minWindowStart = -1;
        int minWindowLen = Integer.MAX_VALUE;

        for(char ch : t.toCharArray()){
            int count   =1;
            if(target.containsKey(ch)){
                count = target.get(ch) + 1;
            }
            target.put(ch, count);
        }

        int start = 0;
        int foundNumber = 0;// this means all letter shows up, you need to shrink window when possible.
        for(int i=0; i<s.length(); i++){
            // move i to include all chars in target.
            char c = s.charAt(i);
            if(!target.containsKey(c)) continue;

            int k = 1;
            if(found.containsKey(c)){
                k = found.get(c) + 1;
            }
            found.put(c, k);
            //once foundNumber reach t.length(), the number stands. found.get(c) will be updated in the next block
            if(found.get(c) <= target.get(c)){
                foundNumber++;
            }

            if(foundNumber == t.length()){ // you don't decrease foundNumber after you found require the number of chars.
                char begin = s.charAt(start);
                // move start as right as possbile, to shrink the window size.
                while(!found.containsKey(begin) || found.get(begin) > target.get(begin)){

                    if(found.containsKey(begin)){
                        found.put(begin, found.get(begin)-1);
                        //you can NOT decrease foundNumber here. there is no go back for foundNumber.
                    }
                    start++;
                    begin = s.charAt(start);
                }

                int len = i-start+1;
                if(len < minWindowLen){
                    minWindowLen = len;
                    minWindowStart = start;
                }
            }
        }

        if(minWindowStart != -1){
            return s.substring(minWindowStart, minWindowStart + minWindowLen);
        }
        return "";
    }
}