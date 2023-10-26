public class PalindromeNumber {
    //Given an integer x, return true if x is a palindrome, and false otherwise.
    public boolean isPalindrome(int x) {
        int numRev = 0;
        int newX = x;
        if(x < 0)
            return false;
        while(newX > 0){
            numRev = 10 * numRev + newX % 10;
            newX = newX/10;
        }
        if(numRev == x)
            return true;
        else
            return false;
    }
}
