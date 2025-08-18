import java.util.Stack;
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }
        str = "";
        while(!s.isEmpty()){
            str += s.pop();
        }
        System.out.println(str);
    }
}
