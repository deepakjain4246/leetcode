class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int last = '0'; 
        String result = "";
        for(char ch : arr) {
            if (Character.isDigit(ch)) {
                int a = ch-'0';
                char c = (char) (last + a);
                result+=c;
            }
            else {
                last = ch;
                result+=ch;
            }
        }
        return result;
    }
}