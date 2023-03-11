class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] record = new int[k];
        answer[0] = score[0];
        int min = score[0];
        int count = 0;
        for(int i = 0; i < score.length; i++){
            if(count < k){
                if(min > score[i]) min = score[i];
                answer[i] = min;
                record[count] = score[i];
                count++;
            }else{
                if(min >= score[i]) answer[i] = min;
                else{
                    int n = record[0];
                    int m = 0;
                    for(int j = 0; j < k; j++){
                        if(record[j] <= score[i] && n >= record[j]){
                            n = record[j];
                            m = j;
                        }
                    }
                    record[m] = score[i];
                    int l = record[0];
                    for(int j = 0; j < k; j++){
                        if(record[j] < l) l = record[j];
                    }
                    min = l;
                    answer[i] = min;
                }
            }
        }
        return answer;
    }
}
