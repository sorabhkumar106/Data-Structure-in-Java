public class Main {
	public static void main(String[] args) {
int[] ar={23,85,46,46,24,96,67,56,37,26,89,97,12};
System.out.println("Given array :");
MergSort.printArray(ar);
System.out.println("\nSorted Array :");
MergSort ms=new MergSort();
ms.sort(ar,0,ar.length-1);
MergSort.printArray(ar);
	}
}
class MergSort {
	public void sort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
	public void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {

				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}
public static void printArray(int[] arr){
	
for(int t:arr){	
System.out.print(t+"  ");
	}	
}

}