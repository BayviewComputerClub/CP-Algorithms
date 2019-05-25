import java.util.*;
public class Difference_Array {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), q = sc.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		int dif[] = new int[n+1];
		initDif(array, dif);
		
		for(int i=0; i<q; i++) {
			int l = sc.nextInt(), r = sc.nextInt(), x = sc.nextInt();
			update(dif, l, r, x);
		}
		int ans[] = convertBack(dif);
		for(int i=0; i<n; i++)
			System.out.print(ans[i] + " ");
		sc.close();
	}
	static void update(int dif[], int l, int r, int x) {
		dif[l] += x;
		dif[r+1] -=x;
	}
	static void initDif(int a[], int d[]) {
		d[0] = a[0];
		d[a.length] = 0;
		for(int i=1; i<a.length; i++)
			d[i] = a[i] - a[i-1];
	}
	static int[] convertBack(int dif[]) {
		int ans[] = new int[dif.length];
		ans[0] = dif[0];
		for(int i=1; i<ans.length; i++) {
			ans[i] = dif[i] + ans[i-1];
		}
		return ans;
	}
}
