import java.util.*;
class exp_conv {
    static boolean isOperator(char x)
    {
        return switch (x) {
            case '+', '-', '/', '*' -> true;
            default -> false;
        };
    }

    static String postToPre(String post_exp)
    {
        Stack<String> s = new Stack<String>();
        int length = post_exp.length();
        for (int i = 0; i < length; i++) {
            if (isOperator(post_exp.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp
                        = post_exp.charAt(i) + op2 + op1;
                s.push(temp);
            }
            else {
                s.push(String.valueOf(post_exp.charAt(i)));
            }
        }

        StringBuilder ans = new StringBuilder();
        for (String i : s)
            ans.append(i);
        return ans.toString();
    }

    static String preToPost(String exp){
        Stack<String> s = new Stack<String>();
        int length = exp.length();
        for(int i=length-1;i>=0;i--){
            if(isOperator(exp.charAt(i))){
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp = op1 + op2 + exp.charAt(i);
                s.push(temp);
            }
            else{
                s.push(String.valueOf(exp.charAt(i)));
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String i : s)
            ans.append(i);
        return ans.toString();
    }

    public static void main(String[] args)
    {
        String post_exp = "ABC/-AK/L-*";
        String pre_exp = "*-A/BC-/AKL";
        System.out.println("Prefix : "
                + postToPre(post_exp));
        System.out.println("Postfix : "
                + preToPost(pre_exp));
    }
}