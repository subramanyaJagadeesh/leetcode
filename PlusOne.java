public class PlusOne {
    //You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    //
    //Increment the large integer by one and return the resulting array of digits.
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int i = digits.length-1;
        int sum = digits[i] + 1;
        carry = sum / 10;
        digits[i] = sum%10;
        i--;
        while(i>=0){
            sum = digits[i] + carry;
            digits[i] = sum%10;
            carry = sum/10;
            i--;
        }
        if(carry !=0){
            int[] newDigits = new int[digits.length +1];
            i=0;
            newDigits[i++] = carry;
            while(i<newDigits.length){
                newDigits[i] = digits[i-1];
                i++;
            }
            return newDigits;
        }
        return digits;
    }
}
