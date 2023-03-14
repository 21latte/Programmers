class Solution {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer();        
        int[][] arr = new int[2][10];
        
        for(int i=0; i<Math.max(X.length(), Y.length()); i++) {
            if(i < X.length()) arr[0][X.charAt(i)-48]++;
            if(i < Y.length()) arr[1][Y.charAt(i)-48]++;
        }
        
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j < Math.min(arr[0][i], arr[1][i]); j++) {
                answer.append(String.valueOf(i));
            }
        }
        
        if(answer.length() == 0) return "-1";
        else if(answer.charAt(0) == '0') return "0";        
        return answer.toString();
    }
}
