public class LengthLastWord {
    //Given a string s consisting of words and spaces, return the length of the last word in the string.
    //
    //A word is a maximal substring consisting of non-space characters only.
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while(i >= 0){
            if(s.charAt(i) != ' ')
                len++;
            if(s.charAt(i) == ' ' && len != 0)
                return len;
            i--;
        }
        return len;
    }
}
