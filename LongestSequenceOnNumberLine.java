import java.util.Arrays;
import java.util.HashMap;

public class LongestSequenceOnNumberLine {
    public static int[]  calculateLongestSequence(int[] houses) {
        int[] dp = new int[houses.length];
        HashMap<Integer, Integer> numberLine = new HashMap<>();
        Arrays.fill(dp, 0);

        for(int i = 0; i < houses.length; i++){
            numberLine.put(houses[i], 1);
            dp[i] = 1;
            dp[i] = Math.max(dp[i], dp[i+1]);
            if(houses[i] == 0){
                dp[i] = 1  + dp[houses[i]+1];
                dp[i] = Math.max(dp[i], dp[houses[i]+1]);
            } else{
                dp[i] = 1 + dp[houses[i] - 1] + dp[houses[i]+1];
                dp[i] = Math.max(dp[i], Math.max(dp[houses[i]-1], dp[houses[i]+1]));
            }
        }
        return dp;
    }
    public static void main(String args[]){
        calculateLongestSequence(new int[]{1,0,4,3,2,8,6,7,5});
    }
}
