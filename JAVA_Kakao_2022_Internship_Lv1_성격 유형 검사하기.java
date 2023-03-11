class Solution {
    // RT, CF, JM, AN
    public String solution(String[] survey, int[] choices) {
        int[] ans = new int[8];
        char[] arr = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(int i = 0; i < survey.length; i++){
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            if(choices[i] == 4) continue;
            else if(choices[i] < 4){
                for(int j = 0; j < 8; j++){
                    if(arr[j] == a) ans[j] += (4 - choices[i]);
                }
            }else if(choices[i] > 4){
                for(int j = 0; j < 8; j++){
                    if(arr[j] == b) ans[j] += (choices[i] - 4);
                }
            }
            for(int j = 0; j < 8; j++){
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
        char[] a = new char[4];
        for(int i = 0; i < 4; i++){
            if(ans[2 * i] < ans[2 * i + 1]) a[i] = arr[2 * i + 1];
            else a[i] = arr[2 * i];
        }
        String answer = String.valueOf(a);
        return answer;
    }
}
