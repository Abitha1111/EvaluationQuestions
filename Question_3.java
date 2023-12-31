package Zsgs;
//
//import java.util.regex.Pattern;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//
//public class Question_3 {
//	public static boolean isValidExpression(String expression) {
//		String regex = "^(\\([^()]*\\))*$";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(expression);
//		return matcher.matches();
//	}
//    public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Expression : ");
//		String S=sc.nextLine();
//		System.out.println((isValidExpression(S) ? "Valid" : "Invalid"));
//		System.out.println();
//}
//	}




import java.util.Scanner;
import java.util.Stack;

public class Question_3 {
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression : ");
        String input = sc.nextLine();
        System.out.println((isValidExpression(input) ? "Valid" : "Invalid"));
    }
}
