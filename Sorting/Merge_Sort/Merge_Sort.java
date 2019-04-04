import java.util.*;
public class Merge_Sort {
     public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        
        mergeSort(array);
        for(int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
        sc.close();
     }
     public static void mergeSort(int array[]){
        mergeSort(array, 0, array.length - 1);   
     }
     public static void mergeSort(int array[], int left, int right) {
        if(left == right) return;
        int mid = (left + right) / 2;
        // sort the left
        mergeSort(array, left, mid);
        // sort the right
        mergeSort(array, mid + 1, right);
        // merge
        merge(array, left, mid, right);
     }
     public static void merge(int array[], int left, int mid, int right) {
        int leftSideSize = mid - left + 1;
        int rightSideSize = right - mid;
        
        int L[] = new int[leftSideSize];
        int R[] = new int[rightSideSize];
        
        // copy the arrays
        for(int i = 0; i < leftSideSize; i++)
            L[i] = array[left + i];
           
        for(int i = 0; i < rightSideSize; i++)
            R[i] = array[mid + 1 + i];
            
        int i = 0, j = 0, k = left;
        // merge
        while(i < rightSideSize && j < leftSideSize) {
            if(L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        
        // copy back the remaining elements into the array
        while(i < leftSideSize) {
            array[k] = L[i];
            i++;
            k++;
        }
        while(j < rightSideSize) {
            array[k] = R[j];
            j++;
            k++;
        }
     }
}
