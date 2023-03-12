class Solution {
    public int solution(int[] ingredient) {
        int count = 0, check = 0, n = 0, m = 0;
        int answer = 0;
        int[] burger = {1, 2, 3, 1};
        while(true){
            for(int i = m; i < ingredient.length; i++){
                if(ingredient[i] == 0) continue;
                if(ingredient[i] == burger[check]) check++;
                else if(ingredient[i] == 1) check = 1;
                else check = 0;
                
                if(check == 4) {
                    check = 0;
                    for(int j = i; j >= 0; j--){
                        if(ingredient[j] != 0) {
                            n++;
                            ingredient[j] = 0;
                            if(n == 4) {
                                n = 0;
                                if(j == 0) {m = j + 3; break;}
                                for(int k = j - 1; k >= 0; k--){
                                    if(ingredient[k] != 0){
                                        if(ingredient[k] == 1) m = k;
                                        else if(k > 0 && ingredient[k] == 2){
                                            for(int a = k - 1; a >= 0; a--){
                                                if(ingredient[a] == 1) {
                                                    m = a;
                                                    break;
                                                }
                                            }
                                        }
                                        else if(k > 1 && ingredient[k] == 3){
                                            for(int a = k - 1; a >= 0; a--){
                                                if(ingredient[a] == 2){
                                                    for(int b = a - 1; b >= 0; b--){
                                                        if(ingredient[b] == 1){
                                                            m = b;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    count++;
                    answer++;
                    break;
                }
            }
            if(count == 0) break;
            count = 0;
        }
        return answer;
    }
}
