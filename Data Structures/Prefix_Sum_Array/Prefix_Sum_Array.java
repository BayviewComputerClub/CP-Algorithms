import java.util.*;
public class Prefix_Sum_Array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int q = sc.nextInt();
        long psa[] = new long[n + 1];
        for(int i = 1; i <= n; i++) {
            psa[i] = sc.nextInt();
            psa[i] += psa[i-1];
        }
        for(int i = 1; i <= q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println("Sum in ranges " + l + " and " + r + " is " + (psa[r] - psa[l-1])); 
        }
        sc.close(); 
    }
}    
