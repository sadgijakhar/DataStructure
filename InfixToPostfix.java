public class InfixToPostfix {
    public static int precendence(char input) {

        if (input == '+') {
            return 1;
        } else if (input == '-') {
            return 1;
        } else if (input == '*') {
            return 2;
        } else if (input == '/') {
            return 2;
        } else if (input == '%') {
            return 2;
        } else if (input == '^') {
            return 3;
        } else {
            return 0;
        }

    }

    static void Postfix(char[] s) {

        int n = s.length;
        char[] P = new char[n];
        int j = 0;
        char[] Stack = new char[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            if ((65 <= s[i] && s[i] >= 90) || (97 <= s[i] && s[i] >= 122)) {
                P[j] = s[i];
                j++;

            }

            else if (s[i] == '(') {
                top++;
                Stack[top] = s[i];

            }

            else if (s[i] == ')') {
                if (top != -1) {
                    while (top != -1 && Stack[top] != '(') {

                        P[j] = Stack[top];
                        j++;
                        top--;
                    }
                    if (top >= 0) {
                        top--;
                    }
                } else {
                    System.out.println("Stop");
                }

            }

            else {

                if (top == -1) {
                    top++;
                    Stack[top] = s[i];
                } else {
                    while (top >= 0 && (precendence(Stack[top]) >= precendence(s[i]))) {
                        P[j] = Stack[top];
                        j++;
                        top--;
                    }
                    top++;
                    Stack[top] = s[i];
                }
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(P[i] + " ");
        }
    }

    public static void main(String[] args) {
        char[] s = { '(', 'A', '+', 'B', '*', '(', 'C', '^', 'D', '-', 'X', '/', 'Y', ')', '+', 'A', ')', '+', 'C' };
        Postfix(s);
    }
}
