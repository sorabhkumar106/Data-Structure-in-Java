public class Main {
	public static void main(String[] args) {
		int	arr[] = {1, 2, 5, 6, 7, 8, 9, 12, 35, 68, 79, 87, 94, 129};
		Main m = new Main();
		int item = 12;
		int t = m.BinarySearch(arr, 0, arr.length , item);
		System.out.println(t);
	}
	public int BinarySearch(int[] arr, int beg, int end, int item) {
		if (beg <= end) {
			int mid = (beg + end) / 2;
			if (arr[mid] == item) {
				return arr[mid];
			} else if (item <arr[mid]) {
				BinarySearch(arr, beg, mid-1, item);
			} else {
				BinarySearch(arr, mid+1, end, item);
			}
		}
		return -1;

	}
}