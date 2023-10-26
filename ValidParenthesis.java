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
        Stack<Character> stack = new Stack();
        for(int i = 0; i<s.length(); i++){
            //if opening parenthesis push to stack
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
                //if close parenthesis and stack empty
            else if(stack.isEmpty())
                return false;
                //close parenthesis but no opening
            else if(
                    (s.charAt(i) == ')' && stack.peek() != '(') ||
                            (s.charAt(i) == ']' && stack.peek() != '[') ||
                            (s.charAt(i) == '}' && stack.peek() != '{')
            )
                return false;
                //close parenthesis with opening
            else
                stack.pop();
        }
        return stack.isEmpty();
    }
}
