class Solution {
    public int solution(int n) {
        n--;
        if(n % 2 == 0) return 2;
        for(int i = 3; i <= n; i += 2){
            if(n % i == 0) return i;
        }
        return 0;
    }
}
