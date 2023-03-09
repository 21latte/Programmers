class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = t.length() - p.length() + 1;
        int[] num_p = new int[p.length()];

        for(int i = 0; i < num_p.length; i++){
            num_p[i] = p.charAt(i);
        }
        
        for(int i = 0; i < len; i++){
            String cut = t.substring(i, i + p.length());
            int count = 0;
            for(int j = 0; j < cut.length(); j++){
                if(cut.charAt(j) == num_p[j]){
                    count++;
                } else if(cut.charAt(j) > num_p[j]){
                    break;
                }else{
                    answer++;
                    break;
                }
                
                if(count == cut.length()) answer++;
            }
        }
        return answer;
    }
}
