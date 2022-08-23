class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1) {
            return s;
        }
        String[] str = new String[numRows];
        
        for(int i =0; i<str.length; i++) {
            str[i] = new String();
        }
        String result = "";
        int row =0, dir = 0;
        
        for(char c : s.toCharArray()){
            row = row+dir;
            str[row] = str[row] + c;
            
            if(row ==0 || row == numRows - 1) {
                dir = (dir == 0) ? 1 : -dir;
            }
        }
        
        for(String s1 : str) {
            result= result+s1;
        }
        return result;
    }
}