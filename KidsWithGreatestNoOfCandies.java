import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNoOfCandies {
    //There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
    //
    //Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
    //
    //Note that multiple kids can have the greatest number of candies.
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList();
        int i = 0;
        int maxIndex = -1;
        int maxNum = Integer.MIN_VALUE;
        while(i<candies.length){
            if(candies[i] > maxNum){
                maxNum = candies[i];
                maxIndex = i;
            }
            i++;
        }
        i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies>=candies[maxIndex]){
                res.add(true);
            }else{
                res.add(false);
            }
            i++;
        }
        return res;
    }
}
