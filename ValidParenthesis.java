import java.util.*;

public class ValidParenthesis {
    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    public boolean isValid(String s) {
        if(s.length()==1){
            return false;
        }
        List<Character> st = new ArrayList<>();
        Map<Character, Character> para = new HashMap<>();
        para.put('(', ')');
        para.put('{', '}');
        para.put('[', ']');
        st.add(s.charAt(0));

        for(int i = 1; i<s.length(); i++){
            if(Objects.nonNull(para.get(s.charAt(i)))){
                st.add(s.charAt(i));
            } else if(st.size() > 0 && Objects.equals(para.get(st.get(st.size()-1)), s.charAt(i))){
                st.remove(st.size()-1);
            } else
                return false;
        }

        if(st.size()>0)
            return false;
        return true;
    }
}
