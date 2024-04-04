/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
*/
package BasicProgram;

	public class MergeArrays { 

		    public static void mergeArrays(int[] X, int[] Y) {
		        int m = X.length;
		        int n = Y.length;
		        int k = m - 1;
		        for (int i = m - 1; i >= 0; i--) {
		            if (X[i] != 0) {
		                X[k] = X[i];
		                k--;
		            }
		        }
		        int i = k + 1;
		        int j = 0;
		        int l = 0;
		        while (i < m && j < n) {
		            if (X[i] < Y[j]) {
		                X[l] = X[i];
		                i++;
		            } else {
		                X[l] = Y[j];
		                j++;
		            }
		            l++;
		        }
		        while (j < n) {
		            X[l] = Y[j];
		            j++;
		            l++;
		        }
		    }

		    public static void main(String[] args) {
		        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
		        int[] Y = {1, 8, 9, 10, 15};

		        mergeArrays(X, Y);
		        for (int num : X) {
		            System.out.print(num + " ");
		        }
		    }
		}


