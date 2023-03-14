class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length - 2; i++){
            for(int j = i + 1; j < number.length - 1; j++){
                int n = number[i] + number[j];
                for(int k = j + 1; k < number.length; k++){
                    if(n + number[k] == 0) answer++;
                }
            }
        }        
        return answer;
    }
}
