class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].contains("ayaaya")) continue;
            if(babbling[i].contains("yeye")) continue;
            if(babbling[i].contains("woowoo")) continue;
            if(babbling[i].contains("mama")) continue;
            
            babbling[i] = babbling[i].replaceAll("aya", " ");
            babbling[i] = babbling[i].replaceAll("ye", " ");
            babbling[i] = babbling[i].replaceAll("woo", " ");
            babbling[i] = babbling[i].replaceAll("ma", " ");
            babbling[i] = babbling[i].replaceAll(" ", "");
            
            if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}
