public class MaxNumVowelsInSubstringOfLen {
    //Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
    //
    //Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
    public boolean isVowel(char c){
        return (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public int maxVowels(String s, int k) {
        int max = 0;
        int i = 0;
        while(i<k){
            if(isVowel(s.charAt(i))){
                max++;
            }
            i++;
        }
        int curr = max;
        while(i<s.length()){
            if(isVowel(s.charAt(i-k))){
                curr--;
            }
            if(isVowel(s.charAt(i))){
                curr++;
            }
            max = Math.max(max, curr);
            i++;
        }
        return max;
    }
}
