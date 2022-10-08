import java.util.Stack;

public class postfixToInfixConversion{
    public static void main(String[] args) {
        System.out.println(postfixToInfix("ab*cd*+e+")); 
    }

    static String postfixToInfix(String convert){
        Stack<String> s = new Stack<>();
    
        for (int i = 0; i < convert.length(); i++){
            // Push operands
            if (isOperand(convert.charAt(i))){
                s.push(convert.charAt(i) + "");
            }
            // We assume that input is
            // a valid postfix and expect
            // an operator.
            else{
                String op1 = s.pop();
                String op2 = s.pop();
                s.push("(" + op2 + convert.charAt(i) +
                        op1 + ")");
            }
        }
    
        // There must be a single element
        // in stack now which is the required
        // infix.
        return s.peek();
        }

        static boolean isOperand(char x)
        {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
        }   
}