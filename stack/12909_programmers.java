import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        int length = s.length(); 

        for (int i = 0; i < length; i++) {
            if(s.charAt(i)=='(') { 
                stack.push('('); // 새로운 짝을 기다리는 (
            } 
            else if (s.charAt(i)==')') {
                if(stack.isEmpty()) // 스택이 비었는데 )가 들어온다 = ( 가 없다 = false
                    return false;
                stack.pop(); // 괄호 한 쌍 => pop
            }
        }
        return stack.isEmpty(); // 다 돌렸는데 비어있지 않다 = 짝을 찾지 못한 (가 남았다
    }
}

