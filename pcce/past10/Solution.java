import java.util.*;
import java.util.stream.*;

class Data {
    int code;
    int date;
    int maximum;
    int remain;
    
    Data(int[] d) {
        this.code = d[0];
        this.date = d[1];
        this.maximum = d[2];
        this.remain = d[3];
    }
    
    int getOption(String ext) {
        switch (ext) {
            case "code":
                return this.code;
            case "date":
                return this.date;
            case "maximum":
                return this.maximum;
            case "remain":
                return this.remain;
        }
        return 0;
    }
}

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Data> datas = new ArrayList<>();
        for (int[] d : data) {
            datas.add(new Data(d));
        }
        
        List<Data> result = datas.stream()
            .filter(d -> d.getOption(ext) <= val_ext)
            .sorted((a, b) -> a.getOption(sort_by) - b.getOption(sort_by))
            .collect(Collectors.toList());
        
        int[][] answer = new int[result.size()][4];
        for (int i = 0; i < result.size(); i++) {
            Data d = result.get(i);
            answer[i][0] = d.code;
            answer[i][1] = d.date;
            answer[i][2] = d.maximum;
            answer[i][3] = d.remain;
        }
        
        return answer;
    }
}