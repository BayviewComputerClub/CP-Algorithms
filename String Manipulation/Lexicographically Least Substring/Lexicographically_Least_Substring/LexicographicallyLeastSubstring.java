import java.util.*;
public class LexicographicallyLeastSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = in.nextLine();
        int K = in.nextInt();
        String min = s.substring(0, K);
        for(int i = 1; i < s.length() - K; i++)
        {
            String temp = s.substring(i,i + K);
            if(temp.compareTo(min) < 0)
                min = temp;
        }
        System.out.println(min);
    }
}
