import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {
    //Given an input string s, reverse the order of the words.
    //
    //A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
    //
    //Return a string of the words in reverse order concatenated by a single space.
    //
    //Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
    public String reverseWords(String s) {
        List<String> rev = new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        int left = 0;
        int right = rev.size() - 1;
        while(left <= right){
            while(rev.get(left) == "" && left<right){
                rev.remove(left);
                right--;
            }
            while(rev.get(right) == "" && right>left){
                rev.remove(right);
                right--;
            }
            if(left==right && rev.get(left) == ""){
                rev.remove(left);
                break;
            }
            String temp = rev.get(left);
            rev.set(left, rev.get(right));
            rev.set(right, temp);
            left++;
            right--;
        }
        return String.join(" ", rev);
    }
}
