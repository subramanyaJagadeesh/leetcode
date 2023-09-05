import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prevNo = lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            int curr = (i < nums.length) ? nums[i] : upper + 1;
            if (prevNo + 1 <= curr - 1) {
                addRange(prevNo + 1, curr - 1, ranges);
            }
            prevNo = curr;
        }
        return ranges;
    }

    private void addRange(int prevNo, int nextNo, List<String> ranges) {
        if (prevNo != nextNo) {
            ranges.add(prevNo + "->" + nextNo);
        } else {
            ranges.add(String.valueOf(prevNo));
        }
    }
}
