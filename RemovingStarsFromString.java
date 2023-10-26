public class RemovingStarsFromString {
    //You are given a string s, which contains stars *.
    //
    //In one operation, you can:
    //
    //Choose a star in s.
    //Remove the closest non-star character to its left, as well as remove the star itself.
    //Return the string after all stars have been removed.
    //
    //Note:
    //
    //The input will be generated such that the operation is always possible.
    //It can be shown that the resulting string will always be unique.
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            while(i<s.length() && s.charAt(i)!= '*'){
                result.append(s.charAt(i));
                i++;
            }
            while(i<s.length() && s.charAt(i) == '*'){
                result.deleteCharAt(result.length()-1);
                i++;
            }
        }
        return result.toString();
    }
}
