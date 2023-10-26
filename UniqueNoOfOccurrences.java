import java.util.HashMap;

public class UniqueNoOfOccurrences {
    //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numToFreq = new HashMap<>();
        HashMap<Integer, Integer> FreqToNum = new HashMap<>();
        for(int x: arr){
            numToFreq.put(x, numToFreq.getOrDefault(x, 0)+1);
        }
        for(int x: arr){
            if(!numToFreq.containsKey(x)){
                continue;
            }
            if(FreqToNum.containsKey(numToFreq.get(x))){
                return false;
            } else {
                FreqToNum.put(numToFreq.get(x), x);
                numToFreq.remove(x);
            }
        }
        return true;
    }
}
