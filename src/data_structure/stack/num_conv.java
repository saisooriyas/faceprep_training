package data_structure.stack;

import java.util.Stack;

public class num_conv {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static int evaluatePrefix(String expression){
        Stack<Integer> stack = new Stack<>();

        for(int i=expression.length()-1;i>=0;i--){
            char ch = expression.charAt(i);

            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch(ch){
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        stack.push(operand1/operand2);
                        break;
                    case '^':
                        stack.push((int)Math.pow(operand1,operand2));
                        break;
                }
            }
        }
        return stack.pop();
    }
    //function for evaluating infix expression
    public static void evaluateInfix(String expression){
        Stack<Integer> stack = new Stack<>();
        Stack<Character> oper = new Stack<>();

        for(int i=expression.length()-1;i>=0;i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                if(ch == ')')
                    oper.push(ch);
                else if(ch == '('){
                    while(!oper.isEmpty() && oper.peek()!=')'){
                        int operand1 = stack.pop();
                        int operand2 = stack.pop();
                        char operator = oper.pop();

                        switch(operator){
                            case '+':
                                stack.push(operand1+operand2);
                                break;
                            case '-':
                                stack.push(operand1-operand2);
                                break;
                            case '*':
                                stack.push(operand1*operand2);
                                break;
                            case '/':
                                stack.push(operand1/operand2);
                                break;
                            case '^':
                                stack.push((int)Math.pow(operand1,operand2));
                                break;
                        }
                    }
                    if(!oper.isEmpty())
                        oper.pop();
                }
                else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^'){
                    while(!oper.isEmpty() && oper.peek()!=')' ){
                        int operand1 = stack.pop();
                        int operand2 = stack.pop();
                        char operator = oper.pop();

                        switch(operator){
                            case '+':
                                stack.push(operand1+operand2);
                                break;
                            case '-':
                                stack.push(operand1-operand2);
                                break;
                            case '*':
                                stack.push(operand1*operand2);
                                break;
                            case '/':
                                stack.push(operand1/operand2);
                                break;
                            case '^':
                                stack.push((int)Math.pow(operand1,operand2));
                                break;
                        }
                    }
                    oper.push(ch);
                }
                oper.push(ch);
            }
        }
        while(!oper.isEmpty() && stack.size()>=2){
            int operand1 = stack.pop();
            int operand2 = stack.pop();
            char operator = oper.pop();

            switch(operator){
                case '+':
                    stack.push(operand1+operand2);
                    break;
                case '-':
                    stack.push(operand1-operand2);
                    break;
                case '*':
                    stack.push(operand1*operand2);
                    break;
                case '/':
                    stack.push(operand1/operand2);
                    break;
                case '^':
                    stack.push((int)Math.pow(operand1,operand2));
                    break;
            }
        }
        System.out.println("Result: "+stack.pop());
    }

    public static void main(String[] args) {
        String postfixExpression = "56+7*";
        int result = evaluatePostfix(postfixExpression);
        String prefixExpression = "+5*67";
        int preresult = evaluatePrefix(prefixExpression);
        String infixExpression = "5+6*7";
        System.out.println("Result: " + result);
        System.out.println("Result: " + preresult);
        evaluateInfix(infixExpression);
    }
}
