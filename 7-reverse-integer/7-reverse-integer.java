class Solution {
    public int reverse(int x) { 
      String sign = String.valueOf(x).substring(0,1);
      long xLong = x;
      long absX = Math.abs(xLong);
      int x1 =  String.valueOf(absX).length();
      String reverse="";
      for(int i=0;i<x1;i++){
           reverse = reverse+absX%(10);
           absX = absX/(10);
       }
      if(reverse.equals(""))
        reverse = "0";
      return  Long.parseLong(reverse) > Integer.MAX_VALUE ? 0:
              sign.equals("-")? -Integer.parseInt(reverse): Integer.parseInt(reverse);
    }
}