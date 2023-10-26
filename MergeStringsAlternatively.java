public class MergeStringsAlternatively {
    //You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
    //
    //Return the merged string.
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int min = Math.min(word1.length(), word2.length());
        while(i < min){
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length()){
            res.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length()){
            res.append(word2.charAt(i));
            i++;
        }
        return res.toString();
    }
}
