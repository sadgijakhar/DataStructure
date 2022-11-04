

public class PostToINWithArray{
    static int precendence(char x){
        if(x == '+'){
            return 1;
        }
        else if(x == '-'){
            return 1;
        }
        else if(x == '*'){
            return 2;
        }
        else if(x == '/'){
            return 2;
        }
        else if(x == '^'){
            return 3;
        }
        return -1;
    }
    static void postTOin(String s , int n){
        String r = " ";
        char exp[] = new char[n];
        int pos = -1;
        int top = -1;
        char p [] = new char[n];
        for(int i = 0  ; i  < n ; i++){
            char c = s.charAt(i);
            if(c  == '('){
                top++;
                exp[top] = c;
            }
            else if(c == ')'){
                while(exp[top] != '('){
                    pos++;
                    p[pos]= exp[top];
                    top--;
                }
                top--;
            }
            else if(Character.isLetterOrDigit(c)){
                pos++;
                p[pos] = c;
            }
            else{
                int x = precendence(c);
                if(top == -1){
                    top++;
                    exp[top] = c;
                }
                else {
                    while( top != -1  && x <= precendence(exp[top])){
                        pos++;
                        p[pos] = exp[top];
                        top--;
                    }
                    top++;
                    exp[top]= c;
                }
            }
        }
        while(top!=-1){
            pos++;
            p[pos] = exp[top];
            top--;
        }
        for(int i = 0 ; i < n ;i++){
            r=r+p[i];
        }
        System.out.println(r);
    }
    public static void main(String[] args) {
        String s = "a^b*c-d+e/f/(g+h)";
        int n = s.length();
        postTOin(s, n);
    }
}