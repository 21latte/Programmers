class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        int cn1 = 0, cn2 = 0;
        char c = 'a';
        
        for(int i = 0; i < arr.length; i++){
            if(cn1 == 0) {
                c = arr[i];
                cn1++;
                if(cn1 != cn2 && i == arr.length - 1) answer++;
                continue;
            }
            if(c == arr[i]) cn1++;
            else cn2++;
            
            if(cn1 == cn2){
                answer++;
                cn1 = 0;
                cn2 = 0;
            }
            if(cn1 != cn2 && i == arr.length - 1) answer++;
        }
        
        return answer;
    }
}
