import java.util.*;

class Solution {
    int sortIdx = 0;
    public List<Integer[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        // ext 값이 val_ext 보다 작은 값만 뽑고
        // sort_by 값으로 오름차순 정렬
        String[] arr = {"code", "date", "maximum", "remain"};
        int extIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(ext)) extIdx = i;
            if (arr[i].equals(sort_by)) sortIdx = i;
        }
        
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                list.add(Arrays.stream(data[i]).boxed().toArray(Integer[]::new));
            }
        }
        // for (Integer[] array : list) {
        //     System.out.println(Arrays.toString(array));
        // }
        
        Collections.sort(list, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] arr1, Integer[] arr2) {
                return Integer.compare(arr1[sortIdx], arr2[sortIdx]);
            }
        });
        
        return list;
    }
}