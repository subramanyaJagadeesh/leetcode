import java.util.HashMap;

public class EqualRowAndColumnPairs {
    //Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
    //
    //A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
    public int equalPairs(int[][] grid) {
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();
        //row
        for(int i = 0; i<grid.length; i++){
            StringBuilder key = new StringBuilder();
            for(int j = 0; j<grid[0].length; j++){
                key.append(",");
                key.append(grid[i][j]);
            }
            map.put(key.toString(), map.getOrDefault(key.toString(),0)+1);
        }
        //column
        for(int i = 0; i<grid.length; i++){
            StringBuilder key = new StringBuilder();
            for(int j = 0; j<grid[0].length; j++){
                key.append(",");
                key.append(grid[j][i]);
            }
            if(map.containsKey(key.toString())){
                count += map.get(key.toString());
            }
        }
        return count;
    }
}
