public class Main {
	public static void main(String[] args) {
		int[] arr={22,85,63,75,62,35,35,96,73,45,35,86,57,59,94};
		quickSort(arr,0,arr.length-1);
		for(int a:arr)
		System.out.print(a+" ");
	}
	public static void quickSort(int[] arr,int lower,int higher){
	while(lower<higher){
		int middle=partition(arr,lower,higher);
		quickSort(arr,lower,middle-1);
		quickSort(arr,middle+1,higher);
			
				}	
	}
public static int partition(int[] arr,int lower,int higher){
	int i=lower+1;
	int j=higher;
	int pivot=lower;
	while(i<j){
	while(arr[i]<arr[pivot] )i++;
	while(arr[j]>arr[pivot])j--;
	if(i<j){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}
	int temp=arr[j];
	arr[j]=arr[pivot];
	arr[pivot]=temp;
	return j;

}
}