import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferenceOfTwoArrays {
    //Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
    //
    //answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
    //answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
    //Note that the integers in the lists may be returned in any order.
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>(2);
        result.add(0, new ArrayList<>());
        result.add(1, new ArrayList<>());
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for(int x: nums1){
            m1.put(x, x);
        }
        for(int x: nums2){
            m2.put(x, x);
        }
        for(int x: m1.keySet()){
            if(!m2.containsKey(x)){
                result.get(0).add(x);
            }
        }
        for(int x: m2.keySet()){
            if(!m1.containsKey(x)){
                result.get(1).add(x);
            }
        }
        return result;
    }
}
