package leetcode;

import java.util.Stack;
/**
 * Author: xuanq
 * Create on: 2018-12-08 12:17
 * <p/>
 * Create: PACKAGE_NAME
 * <p/>
 * Description: 常量类
 * <p/>
 * Update:
 */
class Solution_20 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty())
                    return false;
                char topChar = stack.pop();
                if(c == ')' && topChar != '(')
                    return false;
                if(c == ']' && topChar != '[')
                    return false;
                if(c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution_20().isValid("()[]{[()]}"));
        System.out.println(new Solution_20().isValid("(]{}"));
        System.out.println(new Solution_20().isValid("()[}"));

    }
}
