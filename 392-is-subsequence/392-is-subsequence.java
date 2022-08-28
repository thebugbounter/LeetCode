public class Solution {
	 public boolean isSubsequence(String s, String t) {
		if(s.length() == 0) 
			return true;
		int indexS = 0, indexT = 0;
		while(indexT < t.length()) {
			if(s.charAt(indexS) == t.charAt(indexT)) {
				indexS++;
			}
			indexT++;
			if(indexS == s.length())
				return true;
		}
		return false;
	 }

	public static void main(String[] args) {
/*		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		new Solution().intersection(nums1,nums2);
		int[] result = new Solution().intersection(nums1,nums2);
		for(int num: result) {
			System.out.println(num + " ");
		}*/
		String s = "axc",t = "ahbgdc";
		System.out.println(new Solution().isSubsequence(s, t));
	}

}