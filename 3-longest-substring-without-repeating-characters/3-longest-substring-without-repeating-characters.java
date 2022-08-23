import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() ==0 || s.length() ==1) {
            return s.length();
        }
        
        int max = -1;
        String result = "";
        char[] str = s.toCharArray();
        
        for(char c : str) {
            String st = Character.toString(c);
            if(result.contains(st)) {
                result = result.substring(result.indexOf(st)+1) ;
            }
            result = result+st;
            max = Math.max(max, result.length());
        }
        return max;
    }
}