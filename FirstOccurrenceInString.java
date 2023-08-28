public class FirstOccurrenceInString {
    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public int strStr(String haystack, String needle) {
        int i = 0;
        if(needle.length() > haystack.length()){
            return -1;
        }
        while (i+needle.length() <= haystack.length()){
            if(haystack.subSequence(i, i + needle.length()).equals(needle))
                return i;
            i++;
        }
        return -1;
    }

}
