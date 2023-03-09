class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            if(arr1[s.charAt(i) - 97] == 0){
                answer[i] = -1;
                arr1[s.charAt(i) - 97] = 1;
                arr2[s.charAt(i) - 97] = i;
            }else {
                answer[i] = i - arr2[s.charAt(i) - 97];
                arr2[s.charAt(i) - 97] = i;
            }
        }
        return answer;
    }
}
