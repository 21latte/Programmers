class Solution {
    public int[] solution(String[] wallpaper) {
        int x1 = wallpaper.length;
        int y1 = wallpaper[0].length();
        int x2 = 0;
        int y2 = 0;
        int n = x1, m = y1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(i < x1) x1 = i;
                    if(j < y1) y1 = j;
                    if(i > x2) x2 = i;
                    if(j > y2) y2 = j;
                }
            }
        }
        
        int[] answer = {x1, y1, x2 + 1, y2 + 1};
        return answer;
    }
}
