public class LongestCommonPrefix {
    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String start = strs[0];
        String longest = new String(start);
        for(int i = 1; i < strs.length; i++){
            int length;
            String curr = strs[i];
            start = longest;
            longest = "";
            if(start.length() < curr.length())
                length = start.length();
            else
                length = curr.length();
            for(int j = 0; j < length; j++) {
                if(start.charAt(j) == curr.charAt(j)){
                    longest+=start.charAt(j);
                } else {
                    break;
                }
            }
        }
        return longest;
    }
}
