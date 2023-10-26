import java.util.Stack;

public class AsteroidCollision {
    //We are given an array asteroids of integers representing asteroids in a row.
    //
    //For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
    //
    //Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<Integer>();
        for(int asteroid: asteroids){
            boolean flag = true;
            while(!st.isEmpty() && (st.peek() > 0 && asteroid < 0)){
                if(Math.abs(asteroid) > Math.abs(st.peek())){
                    st.pop();
                    continue;
                }
                else if(Math.abs(asteroid) == Math.abs(st.peek())){
                    st.pop();
                }
                flag = false;
                break;
            }
            if(flag){
                st.add(asteroid);
            }
        }
        return st.stream().mapToInt(i->i).toArray();
    }
}
