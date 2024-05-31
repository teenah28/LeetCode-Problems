import java.util.Stack;

class Solution {
    static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    static boolean isMatching(char a, char b){
        return (a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(isOpening(curr))
                stack.push(curr);
            else{
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(!isMatching(top, curr))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}