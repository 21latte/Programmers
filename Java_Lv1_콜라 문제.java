class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int mid = b * (n / a);
            answer += b * (n / a);
            n =  (n % a) + mid;
        }
        return answer;
    }
}
