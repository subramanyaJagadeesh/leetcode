public class StringCompression {
    //Given an array of characters chars, compress it using the following algorithm:
    //
    //Begin with an empty string s. For each group of consecutive repeating characters in chars:
    //
    //If the group's length is 1, append the character to s.
    //Otherwise, append the character followed by the group's length.
    //The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
    //
    //After you are done modifying the input array, return the new length of the array.
    //
    //You must write an algorithm that uses only constant extra space.
    public int compress(char[] chars) {
        if(chars.length == 1)
            return 1;
        int left = 0;
        int right = 1;
        int prevCharLen = 1;
        char prevChar = chars[0];
        while(right < chars.length){
            while(right<chars.length && chars[right-1] == chars[right]){
                prevCharLen++;
                right++;
            }
            chars[left++] = prevChar;
            if(prevCharLen != 1){
                char[] inS = String.valueOf(prevCharLen).toCharArray();
                for(char c: inS){
                    chars[left++] = c;
                }
            }
            if(right<chars.length){
                prevChar = chars[right];
                prevCharLen=1;
                right++;
            }
        }
        if(prevCharLen == 1){
            chars[left] = prevChar;
            return left+1;
        }return left;
    }
}
