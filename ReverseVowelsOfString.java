public class ReverseVowelsOfString {
    //Given a string s, reverse only all the vowels in the string and return it.
    //
    //The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] str = s.toCharArray();
        while(left<right){
            while("aeiouAEIOU".indexOf(str[left]) < 0 && left<right){
                left++;
            }
            while("aeiouAEIOU".indexOf(str[right]) < 0 && right>left){
                right--;
            }
            char temp = str[right];
            str[right] = str[left];
            str[left] = temp;
            left++;
            right--;
        }
        return new String(str);
    }
}
