public class GreatestCommonDivisorStrings {
    //For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
    //
    //Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))){
            return "";
        }
        int gcdN = gcd(str1.length(), str2.length());
        String gcd = str1.substring(0, gcdN);
        return gcd;
    }
}
