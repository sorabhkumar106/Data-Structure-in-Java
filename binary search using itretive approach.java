public class Main {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,9,10,19,37,57,67,89};
		int item=387;
		int beg=0;
		int end=arr.length-1;
		int mid=end+beg/2;
		while(beg<=end && end>0){
			mid=end+beg;
		if(item==arr[mid]){
			System.out.println(arr[mid]+" is found");
			break;
			}
		else if(item<arr[mid]){	
		end=mid-1;	
		}
		else if(item>arr[mid]){
		beg=mid+1;	
			
		}
		}
		if(arr[mid]!=item){
	System.out.println("Element is not found");		
		}
	}
}