// import java.util.ArrayDeque;
// import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        String openChars = "{([";
        String closedChars = "})]";

        Deque<Character> stack = new ArrayDeque();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);


            if (closedChars.indexOf(currentChar) >= 0) {
                if(stack.isEmpty()) {
                    return false;
                }

                char prev = stack.pop();

                int closedIdx = closedChars.indexOf(currentChar);
                int openIdx = openChars.indexOf(prev);

                if (closedIdx != openIdx) {
                    return false;
                }
            } else {
                stack.push(currentChar);
            }
        }

        return stack.size() == 0;
    }
}