class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        char[][] key = new char[100][100];
        for(int i = 0; i < keymap.length; i++){
            String emp = keymap[i];
            for(int j = 0; j < emp.length(); j++){
                key[i][j] = emp.charAt(j);
            }
        }
        int check = 1;
        for(int i = 0; i < targets.length; i++){
            char[] str = targets[i].toCharArray();
            check = 1;
            for(int j = 0; j < str.length; j++){
                int count = 100;
                for(int k = 0; k < keymap.length; k++){
                    for(int l = 0; l < keymap[k].length(); l++){
                        if(key[k][l] == str[j] && count > l){
                            count = l + 1;
                            break;
                        }
                    }
                }
                if(count == 100) check = 0;
                answer[i] += count;
            }
            if(check == 0) answer[i] = -1;
        }
        return answer;
    }
}
