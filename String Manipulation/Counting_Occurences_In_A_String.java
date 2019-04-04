import java.util.*;
public class CoutingOccurencesInAString {
    public static void main(String[]args) { 
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split("");
        int scnt = 0, ocnt = 0, ucnt = 0, pcnt = 0;
        for(int i = s.length - 1; i >= 0; i--) {
            if(s[i] == 'p') pcnt++;
            if(s[i] == 'u') ucnt += pcnt;
            if(s[i] == 'o') ocnt += ucnt;
            if(s[i] == 's') snct += ocnt;
        }
        System.out.println(scnt);
        sc.close();
    }
    
}
