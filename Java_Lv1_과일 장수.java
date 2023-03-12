class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] num = new int[10];
        
        for(int i = 0; i < score.length; i++){
            num[score[i]]++;
        }
        
        for(int i = num.length - 1; i >= 1; i--){
            int l = num[i] / m;
            int n = num[i] % m;
            
            answer += l * i * m;
            num[i - 1] += n;
        }
        
        return answer;
    }
}
