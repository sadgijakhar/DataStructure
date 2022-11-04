import java.util.Stack;

public class HarshInfix2Postfix{
    public static void main(String[] args) {
        String s = postfix("(A+B*(C^D-X/Y)+A)+C");
        System.out.println(s);
    }
    
    static int prec(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }


    static String postfix(String s){
        StringBuilder r = new StringBuilder();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)) r.append(c);
            else if (c == '(') st.push(c);
            else if (c == ')') {
                while(!st.isEmpty() && st.peek() != '('){
                    r.append(st.peek());
                    st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && prec(c)<=prec(st.peek())){
                    r.append(st.peek());
                    st.pop();
                }
                st.push(c);
            }

        }
        while(!st.isEmpty()){
            r.append(st.peek());
            st.pop();
        }
        return r.toString();
    }
}