public class Sqrt {
    //Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
    //
    //You must not use any built-in exponent function or operator.
    //
    //For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
    public int mySqrt(int x) {
        if(x < 2) return x;
        int low = 1;
        int high = x/2;
        int mid = 0;
        long num;
        while(low <= high){
            mid = low + (high - low)/2;
            num = (long) mid * mid;
            if(num == x){
                return mid;
            }
            if(num > x){
                high = mid - 1;
            } else if(num < x){
                low = mid + 1;
            }
        }
        return high;
    }
}
