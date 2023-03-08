class Solution {
    public String solution(String s, String skip, int index) {
        char[] ans = s.toCharArray();
        char[] sk = skip.toCharArray();
        boolean[] check = new boolean[26];
        
        for(int i = 0; i < sk.length; i++){
            int n = sk[i] - 97;
            check[n] = true;
        }
        
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < index; j++){
                ans[i]++;
                if(ans[i] == 123) ans[i] -= 26;
                for(int k = 0; k < check.length; k++){
                    if(check[ans[i] - 97]) ans[i]++;
                    if(ans[i] == 123) ans[i] -= 26;
                }
            }
        }
        
        return String.valueOf(ans);
    }
}
