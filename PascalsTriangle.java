import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    //Given an integer numRows, return the first numRows of Pascal's triangle.
    //
    //In Pascal's triangle, each number is the sum of the two numbers directly above it as shown
    public List<List<Integer>> generate(int numRows) {
        int i = 1;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(1)));
        while(i < numRows){
            List<Integer> currentRow = new ArrayList<>(i+1);
            currentRow.add(0, 1);
            int j = 1;
            while(j < i){
                currentRow.add(j, result.get(i - 1).get(j-1) + result.get(i - 1).get(j));
                j++;
            }
            currentRow.add(i, 1);
            result.add(currentRow);
            i++;
        }
        return result;
    }
}
