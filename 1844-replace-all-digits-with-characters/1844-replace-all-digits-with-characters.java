class Solution {
    public String replaceDigits(String s) {
        int length = s.length();
        String result = "";
        for(int i =0; i<length; i++) {
            char ch = s.charAt(i);
            if(i%2 !=0) {
                int temp1 =s.charAt(i-1)+s.charAt(i) - '0';
                char temp = (char)temp1;
                result = result+temp;
                continue;
            }
            result = result+ch;
        }
        return result;
    }
}