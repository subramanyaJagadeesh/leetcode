public class PalindromeNumber {
    //Given an integer x, return true if x is a palindrome, and false otherwise.
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() -1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
