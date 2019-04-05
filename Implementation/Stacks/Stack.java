import java.util.*;
public class Main {
    /**
    * A stack is a first in last out data structure
    **/
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 1; i <= 10; i++) 
            st.push(i);
        while(!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
