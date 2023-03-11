import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] count = new int[id_list.length];
        int[][] user = new int[id_list.length][id_list.length];
        HashMap<String, String> map = new HashMap<String, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        
        for(int i = 0; i < id_list.length; i++){
            map2.put(id_list[i], i);
        }
        
        for(int i = 0; i < report.length; i++){
            String[] arr = report[i].split(" ");
            if(map.get(report[i]) == null){
                map.put(report[i], arr[1]);
                user[map2.get(arr[0])][map2.get(arr[1])]++;
            }
        }
        
        for(String key : map.keySet()) {
            String value = map.get(key);
            count[map2.get(value)]++;
        }
        
        for(int i = 0; i < count.length; i++){
            if(count[i] >= k){
                for(int j = 0; j < id_list.length; j++){
                    if(user[j][i] == 1) answer[j]++;
                }
            }
        }
        
        return answer;
    }
}
