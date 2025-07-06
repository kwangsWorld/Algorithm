// import java.util.ArrayList;

// class Solution {
//     public int[] solution(int[] arr, int[] query) {
        
//         ArrayList<Integer> list = new ArrayList<>();
//         int idx = 0;
        
//         for(int i : arr){
//             list.add(i);
//         }
        
//         for(int i = 0; i < query.length; i++){
//             if(i % 2 == 0){
//                 idx = query[i];
//                 for(int j = list.size()-1; j > idx; j--){
//                     list.remove(j);
//                 }
//             }else{
//                 idx = list.indexOf(query[i]);
//                 for(int j = 0; j < idx; j++){
//                     list.remove(0);
//                 }
//             }
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i = 0; i < answer.length; i++){
//             answer[i] = list.get(i);
//         }
        
        
//         return answer;
//     }
// }

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        for (int i = 0; i < query.length; i++) {
            int idx = query[i];

            if (i % 2 == 0) {
                for (int j = list.size() - 1; j > idx; j--) {
                    list.remove(j);
                }
            } else {
                for (int j = 0; j < idx; j++) {
                    list.remove(0);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}