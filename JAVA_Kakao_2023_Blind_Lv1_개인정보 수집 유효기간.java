class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayYear = Integer.parseInt(today.substring(2, 4));
        int todayMonth = Integer.parseInt(today.substring(5, 7));
        int todayDay = Integer.parseInt(today.substring(8, 10));
        
        int[] ans = new int[privacies.length];
        int count = 0;
        
        for(int i = 0; i < privacies.length; i++){
            int privacyYear = Integer.parseInt(privacies[i].substring(2, 4));
            int privacyMonth = Integer.parseInt(privacies[i].substring(5, 7));
            int privacyDay = Integer.parseInt(privacies[i].substring(8, 10));
            
            int dayLater = ((todayYear - privacyYear) * 12 * 28) + ((todayMonth - privacyMonth) * 28) + (todayDay - privacyDay);
                
            for(int j = 0; j < terms.length; j++){
                if(terms[j].charAt(0) == privacies[i].charAt(11)){
                    if(terms[j].length() == 3 && dayLater >= (28 * (terms[j].charAt(2) - 48))) {ans[i] = i + 1; count++;}
                    else if(terms[j].length() == 4 && dayLater >= (28 * ((terms[j].charAt(2) - 48) * 10 + terms[j].charAt(3) - 48))) {ans[i] = i + 1; count++;}
                    else if(terms[j].length() == 5 && dayLater >= 2800) {
                        ans[i] = i + 1;
                        count++;
                    }
                }
            }
        }
        
        int[] correct = new int[count];
        count = 0;
        for(int i = 0; i < ans.length; i++){
            if(ans[i] != 0) {
                correct[count] = i + 1;
                count++;
            }
        }
        
        return correct;
    }
}
