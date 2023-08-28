public class AddBinary {
    //Given two binary strings a and b, return their sum as a binary string.
    public String addBinary(String a, String b) {
        int carry = 0;
        int sum = 0;
        StringBuilder result = new StringBuilder();
        int aPointer = a.length() -1;
        int bPointer = b.length() -1;
        while(aPointer >=0 && bPointer >=0) {
            sum = Character.getNumericValue(a.charAt(aPointer)) + Character.getNumericValue(b.charAt(bPointer)) + carry;
            carry = sum/2;
            result.append(sum%2);
            aPointer--;
            bPointer--;
        }
        sum = 0;
        if(aPointer >=0){
            while(aPointer >-1){
                sum = Character.getNumericValue(a.charAt(aPointer)) + carry;
                carry = sum/2;
                result.append(sum%2);
                aPointer--;
            }
        }
        sum = 0;
        if(bPointer >=0){
            while(bPointer >-1){
                sum = Character.getNumericValue(b.charAt(bPointer)) + carry;
                carry = sum/2;
                result.append(sum%2);
                bPointer--;
            }
        }
        if(carry!=0)
            result.append(carry);
        return result.reverse().toString();
    }
}
