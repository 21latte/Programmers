class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int n = (int)Math.sqrt(i);
            int count = 0;
            for(int j = 1; j <= n; j++){
                if(i % j == 0) count++;
            }
            if(count <= limit && (float)i / n == n) count = count * 2 - 1;
            else if(count <= limit && (float)i / n != n) count = count * 2;
            if(count > limit) count = power;
            
            answer += count;
        }
        return answer;
    }
}
