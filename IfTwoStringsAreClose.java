import java.util.Arrays;

public class IfTwoStringsAreClose {
    //Two strings are considered close if you can attain one from the other using the following operations:
    //
    //Operation 1: Swap any two existing characters.
    //For example, abcde -> aecdb
    //Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
    //For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
    //You can use the operations on either string as many times as necessary.
    //
    //Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int word1Map[] = new int[26];
        int word2Map[] = new int[26];
        for (char c : word1.toCharArray()) {
            word1Map[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            word2Map[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((word1Map[i] == 0 && word2Map[i] > 0) ||
                    (word2Map[i] == 0 && word1Map[i] > 0)) {
                return false;
            }
        }
        Arrays.sort(word1Map);
        Arrays.sort(word2Map);
        return Arrays.equals(word1Map, word2Map);
    }
}
