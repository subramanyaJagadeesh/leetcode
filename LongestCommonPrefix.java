public class LongestCommonPrefix {
    //Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".
    public String longestCommonPrefix(String[] strs) {
        //take first string as longest
        String longest = strs[0];
        int i = 1;
        //loop over all strings
        while(i < strs.length) {
            int j = 0;
            //there is no common
            if(longest.equals("")){
                return "";
            }
            while(j < Math.min(longest.length(), strs[i].length())){
                //increment index if chars match
                if(longest.charAt(j) == strs[i].charAt(j)){
                    j++;
                    continue;
                }
                break;
            }
            longest = longest.substring(0, j);
            i++;
        }
        return longest;
    }
}
